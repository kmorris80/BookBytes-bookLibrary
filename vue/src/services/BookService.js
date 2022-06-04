import axios from 'axios';

export default {

  get(bookID) {
    return axios.get(`/book/${bookID}`)
  },

  list() {
      return axios.get('/book')
  },

  create(book) {
    return axios.post('/book' , book)
  },
  //creating a method to get the list by the userID (may need to be readingID)
  getReadingList(userID){
    return axios.get(`/book/${userID}`)
  },
  
  addBookToList(book){
    return axios.post(`/myReadingList`, book)
  }
    
  
}
