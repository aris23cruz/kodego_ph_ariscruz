package activity04B

class Magazines(var editor:String, override var title:String, var monthPublished:String, var yearPublished:String,
                content: String,
                author: String): Article(title, content, author)