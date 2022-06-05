<template>
      <div id=searchBooks class="search">
        <div class="title-input spacing" id="title-field">
          <input
          class="form-control"
          type="text"
          placeholder="Title"
          v-model="filter.title"
          />
        </div>
        <div class="author-input spacing" id="author-field">
          <input
          class="form-control"
          type="text"
           placeholder="Author"
           v-model="filter.author"
         
          />

        </div>
         <div class="character-input spacing" id="character-field">
          <input
          class="form-control"
          type="text"
           placeholder="Character"
           v-model="filter.character"
        
          />
        </div>
         <div class="genre-input spacing" id="genre-field">
          <input
          class="form-control"
          type="text"
           placeholder="Genre"
           v-model="filter.genre"
           
          />
        </div>
         <div class="keyword-input spacing" id="keyword-field">
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
.spacing{
  padding: 5px;
}

.search {
  display: flex;
  padding-bottom: 20px;
  justify-content: center;
}

</style>
