import axios from 'axios';

export default {

  create(book){
    return axios.post('/book/', book)
  }

}

  