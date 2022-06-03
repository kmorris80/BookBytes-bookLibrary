<template>
      <div id=searchBooks class="search">
        <div class="title-input" id="title-field">
          <label>Title:</label>
          <input
          class="form-control"
          type="text"
          placeholder="Title"
          v-model="filter.title"
          />
        </div>
        <div class="author-input" id="author-field">
          <label>Author:</label>
          <input
          class="form-control"
          type="text"
           placeholder="Author"
           v-model="filter.author"
         
          />

        </div>
         <div class="character-input" id="character-field">
          <label>Character:</label>
          <input
          class="form-control"
          type="text"
           placeholder="Character"
           v-model="filter.character"
        
          />
        </div>
         <div class="genre-input" id="genre-field">
          <label>Genre:</label>
          <input
          class="form-control"
          type="text"
           placeholder="Genre"
           v-model="filter.genre"
           
          />
        </div>
         <div class="keyword-input" id="keyword-field">
          <label>Keyword:</label>
          <input
          class="form-control"
          type="text"
          placeholder="Keyword"
          v-model="filter.keyWord"

          />
        </div>
                
      </div>    
</template>

<script>
 import bookService from '../services/BookService.js'
export default{
   name: 'book-list',
  data() {
    return {
      books: [],

      filter:{
        title: '',
        author: '',
        character: '',
        genre:'',
        keyWord:''
      }
      }
  },
  computed:{
    filteredBooks(){
      let filteredBooks= this.books;
      if(this.filter.title !=''){
        filteredBooks = filteredBooks.filter((books)=>books.title.toLowerCase().includes(this.filter.title.toLowerCase()))
      }
      if(this.filter.author !=''){
        filteredBooks = filteredBooks.filter((books)=>books.author.toLowerCase().includes(this.filter.author.toLowerCase()))
      }
      if(this.filter.character !=''){
        filteredBooks = filteredBooks.filter((books)=>books.character.toLowerCase().includes(this.filter.character.toLowerCase()))
      }
      if(this.filter.genre !=''){
        filteredBooks = filteredBooks.filter((books)=>books.genre.toLowerCase().includes(this.filter.genre.toLowerCase()))
      }
      if(this.filter.keyWord !=''){
        filteredBooks = filteredBooks.filter((books)=>books.keyWord.toLowerCase().includes(this.filter.keyWord.toLowerCase()))
      }
      return filteredBooks;

    }

  },
  methods:{
  created(){
    bookService.list().then((response) =>{
      this.books = response.data;
    })
  }
  }
}
</script>



<style scoped>
input{
    width: 500px;
    padding-left: 20px;
}

</style>
