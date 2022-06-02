import axios from 'axios';

export default {

  getKid(kidId) {
    return axios.get(`/kids/${kidId}`)
  },

  list() {
      return axios.get('/kids')
  },
}