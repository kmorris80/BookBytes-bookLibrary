<template>
    <div class="kid-card">
        <h2>{{ kid.username }}</h2>
        <h2>{{ kid.points }}</h2>
        <h2>{{ kid.steps }}</h2>
        <h2>{{ kid.activityTime }}</h2>
        <div>
          <router-link :to="{name: 'kidCardBack'}" tag="button" class="btn btn-lg btn-primary btn-block">Add Activity/Steps</router-link>
        </div>
    </div>
     
</template>

<script>

import kidService from "../services/KidsService"

export default {
    name: "kid-detail",
    data() {
        return {
            kid: {
                id: null,
                username: "",
                steps: null,
                activityTime: null,
                points: null
            }
        }
    },
    created() {
        kidService.getKid(this.$route.params.id).then((response) => {
            this.kid = response.data;
        })
    },
}
</script>

<style scoped>

.kid-card {
    border: solid 10px;
    background-color: #86cacd;
    text-align: center;
    border-radius: 25px    
}

h2 {
    border: solid 1px;
    margin-left: 20px;
    margin-right: 20px; 
    border-radius: 10px;
}

img {
    height: 20vh;
    padding: 10px;
    
}

</style>