<template>
    <div class="kid-card">
        <img src="../assets/kidoutline.png" alt="kid">
        <h2>Name</h2>
        <h2>Points</h2>
        <h2>Steps</h2>
        <h2>Activity Time</h2>
        <h2>Play Time Remaining</h2>
    </div>
</template>

// <script>
// export default {
//     props: [
//         'name'
//     ]
// }
// </script>

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