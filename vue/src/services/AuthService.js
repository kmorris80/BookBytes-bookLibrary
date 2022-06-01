import axios from 'axios';

export default {

  login(user) {
    return axios.post('/login', user)
  },

  register(user) {
    return axios.post('/register', user)
  }

}

//paths and verbs correspond to controller on back end
//create a new service
//create a controller
//service for activities