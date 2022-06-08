import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080"
});

export default {

    create(message) {
        return http.post('/addComment', message)
    },

    
}