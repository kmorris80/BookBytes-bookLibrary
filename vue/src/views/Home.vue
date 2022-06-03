<template>
  <div class="home">
    <header>
      <h1 id="welcome">Let's Get Moving!</h1>
      <div id="add-kid">
      <router-link :to="{name: 'register'}">+ Add Kid</router-link>
      <!-- <button @click="showForm = !showForm">Add Kid</button> -->
      </div>
      
      <!-- <add-kid v-show="showForm"></add-kid> -->
    </header>

    <kid-cards v-for="kid in kids" :key="kid.id"></kid-cards>
    <kid-cards></kid-cards>
    
  </div>
</template>

<script>
<<<<<<< HEAD
import kidCards from '../components/BookCards.vue';
import kidsService from '../services/KidsService'
=======
import kidCards from '../components/KidCards.vue';
import kidsService from '../services/BookService'
>>>>>>> 6dbc3d2da6d734d65602e463d911854bcc4290de


export default {
  name: "home",
  components: {
    kidCards,
  },
  data() {
    return {
      kids: []
    }
  },
  created() {
    kidsService.list().then((response) => {
      this.kids = response.data;
    });
  },
};
</script>

<style scoped>
.home {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  gap: 20px;

  grid-template-areas: 
  "header header header header"
  "card card card card"
  ;
}

header {
  grid-area: header;
}

kid-cards {
  grid-area: card;
}

#welcome {
  text-align: center;
  margin: 50px;
}
#add-kid{
  text-align: center;
  font-size: 2em;
}
</style>