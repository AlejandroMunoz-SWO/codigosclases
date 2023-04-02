from database.db import db
from flask import Blueprint
from flask_marshmallow import Marshmallow

ma = Marshmallow()

class Author(db.Model):
    __tablename__ = 'authors'
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(100), nullable=False)
    books = db.relationship('Book', backref='author', lazy=True)


    def __init__(self, id, name, books):
        self.id = id
        self.name = name
        self.books= books

class Book(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100), nullable=False)
    author_id = db.Column(db.Integer, db.ForeignKey('author.id'), nullable=False)

    def __init__(self,id, title, author_id):
        self.id = id
        self.title = title
        self.author_id= author_id

class AuthorSchema(ma.Schema):
    class Meta:
        model = Author
    books = ma.Nested('BookSchema', many=True)

class BookSchema(ma.Schema):
    class Meta:
        model = Book
    author = ma.Nested('AuthorSchema')

author_schema = AuthorSchema()
authors_schema = AuthorSchema(many=True)
book_schema = BookSchema()
books_schema = BookSchema(many=True)

authors = Blueprint('authors', __name__)

@authors.route('/authors', methods=['GET'])
def get_authors():
    all_authors = Author.query.all()
    result = authors_schema.dump(all_authors)
    return jsonify(result)


