import axios from 'axios';

export default {

  get(id) {
    return axios.get(`/book/${id}`)
  },

  list() {
      return axios.get('/book')
  },

  create(book) {
    return axios.post('/book' , book)
  }
}
