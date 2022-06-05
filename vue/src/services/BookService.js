import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080"
});

export default {

  get(bookID) {
    return http.get(`/book/${bookID}`)
  },

  list() {
      return http.get('/allBooks')
  },

  create(book) {
    return http.post('/addBook' , book)
  },
  //creating a method to get the list by the userID (may need to be readingID)
  getReadingList(userID){
    return http.get(`/book/${userID}`)
  },
  
  addBookToList(book){
    return http.post(`/myReadingList`, book)
  }
}
