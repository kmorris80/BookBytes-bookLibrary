<template>
              <div id=searchBooks class="instant-search">
                  <div class="instant-search__input-container">
                      <input type="text" class="instant-search__input" spellcheck="false" placeholder = "Search Books"/>
                       </div>   
                       <div class="instant-search__results-container">
                           <div class="instant-search__results">
                               <a href="#" class="instant-search__result">
                                   <div class="instant-search__title">Title</div>
                                   <p class="instant-search__paragraph">
                                       Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsa, asperiores! Voluptate vero 
                                       debitis id hic veritatis amet voluptatibus? Corrupti tempore facilis illo voluptatum quia maiores 
                                       tempora? In non magnam sint!
                                    </p>
                               </a>
                               
                               
                               </div>   
                           </div> 
                        </div>    
    
 








        <!-- <label for="title-search" id="title-input">Title:</label>
        <input
          type="text"
          id="title"
          class="form-control"
          placeholder="Search by title, author, keyword..."
          v-model="input"
          required
          autofocus
        />
        <div class="book-search" v-for="book in books" :key="book">
        <div class="item error" v-if="input&&!filteredList().length">
            <p>No results found!</p>
        </div>
         <div>
        <label for="author-search" id="author-input">Author:</label>
        <input
          type="text"
          id="author"
          class="form-control"
          placeholder=""
          required
          autofocus
        />
        </div>
        <div>
        <label for="character-search" id="character-input">Character:</label>
        <input
          type="text"
          id="character"
          class="form-control"
          placeholder=""
          required
          autofocus
        />
        </div>
         <div>
        <label for="genre-search" id="genre-input">Genre:</label>
        <input
          type="text"
          id="genre"
          class="form-control"
          placeholder=""
          required
          autofocus
        />
        </div>
         <div>
        <label for="keyword-search" id="keyword-input">Keyword:</label>
        <input
          type="text"
          id="Keyword"
          class="form-control"
          placeholder=""
          required
          autofocus
        />
        </div>
         <button class="btn btn-primary btn-lg">Search</button>
        </div> -->
</template>

<script>



</script>

<style scoped>
input{
    width: 500px;
}

</style>
