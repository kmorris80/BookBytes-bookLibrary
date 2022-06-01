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

    <kid-cards></kid-cards>
    
  </div>
</template>

<script>
// import addKid from '../components/AddKid.vue';
import kidCards from '../components/KidCards.vue';


export default {
  name: "home",
  // data() {
  //   return {
  //     name: "",
  //     showForm: false,
  //   }
  // },
  components: {
    kidCards,
    // addKid
  }
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