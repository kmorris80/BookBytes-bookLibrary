// <template> 
<!-- //wrap in a v-if $store.state.user.permission - allow show page, if not show "you don't have access" -->
  <div class="text-center">
    <form class="new-book-form" v-on:submit.prevent="saveBook">
      <header>
        <img id = "NewBookForm" src="../assets/NewBookForm.png"/>
        </header>
        <div class ="img">
    
      </div>
      <div class="input">
        <input
          class="form-control"
          type="text"
          placeholder="Title"
          v-model="book.title"
          required
        />
        <input
          class="author-input form-control"
          type="text"
          placeholder="Author"
          v-model="book.author"
          required
        />
        <input
          class="form-control"
          type="text"
          placeholder="Genre"
          v-model="book.genre"
          required
        />
        <input
          class="form-control"
          type="text"
          placeholder="Keyword"
          v-model="book.keyword"
          required
        />
        <input
          class="form-control"
          type="text"
          placeholder="Character"
          v-model="book.character"
          required
        />
         <input
          class="form-control"
          type="text"
          placeholder="ISBN"
          v-model="book.isbn"
          required
        />
      </div>
      <!-- <div>
        <label for="new-release-input" id="checkbox-text">New Release:</label>
        <input
          class="form-check-input"
          id="checkbox-text"
          type="checkbox"
          placeholder="New Release"
          v-model="book.newRelease"
        />
      </div> -->
      <button class="btn btn-primary btn-lg">Save</button>
    </form>
  </div>
</template>

<script>
import bookService from "../services/BookService.js";
export default {
  name: "new-book-form",

  data() {
    return {
      book: {
        title: "",
        author: "",
        genre: "",
        keyword: "",
        character: "",
        isbn:"",
        newRelease: false,
      },
    };
  },
  methods: {
       saveBook() {
        bookService
        .create(this.book)
        .then((response)=>{
          console.log(response.status)
          if(response.status === 200){
            window.alert("Book Created!"); 
          }
        });
      }
    }
  }

</script>
<style scoped>
input {
  margin-bottom: 20px;
  margin-top: 5px;
  outline: solid 2px #f3969a;
  font-size: 20px;
}

.input {
  padding-left: 500px;
  padding-right: 500px;
}

#checkbox-text {
  font-size: 20px;
  font-weight: bolder;
}

header{
  text-align: center;
  padding: 50px;
}

button{
  box-shadow: grey;
}

</style>