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
export default{
   name: 'book-list',
   props: {
     books: Array,
   },
  data() {
    return {
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
        filteredBooks = filteredBooks.filter((book)=>book.title.toLowerCase().includes(this.filter.title.toLowerCase()))
      }
      if(this.filter.author !=''){
        filteredBooks = filteredBooks.filter((book)=>book.author.toLowerCase().includes(this.filter.author.toLowerCase()))
      }
      if(this.filter.character !=''){
        filteredBooks = filteredBooks.filter((book)=>book.character.toLowerCase().includes(this.filter.character.toLowerCase()))
      }
      if(this.filter.genre !=''){
        filteredBooks = filteredBooks.filter((book)=>book.genre.toLowerCase().includes(this.filter.genre.toLowerCase()))
      }
      if(this.filter.keyWord !=''){
        filteredBooks = filteredBooks.filter((book)=>book.keyWord.toLowerCase().includes(this.filter.keyWord.toLowerCase()))
      }
      return filteredBooks;
    }
  },
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
