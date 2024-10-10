<template>
  <div id="dictionary-app">
    <header>
      <div>
        <img alt="My Dictionaries" src="./assets/dictionary.png" id="logo" />
        <h1>My Dictionaries</h1>
      </div>
      <nav>
        <router-link v-bind:to="{ name: 'home' }">
          <button>Home</button>
        </router-link>
        <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token">
          <button>Logout</button>
        </router-link>
        <router-link v-bind:to="{ name: 'login' }" v-else>
          <button>Login</button>
        </router-link>
      </nav>
    </header>

    <main>
      <router-view />
    </main>
    <footer>&copy; 2024. All rights reserved.</footer>
  </div>
</template>

<style scoped>
#dictionary-app {
  height: 98vh;
  font-family: Arial, Helvetica, sans-serif;
  background-color: lightsteelblue;
  display: grid;
  gap: 5px;
  grid-template-columns: 1fr;
  grid-template-rows: auto 1fr auto;
  grid-template-areas:
    "header"
    "main"
    "footer";
}

main, header, footer {
    border-radius: 5px;
    padding: 5px;
}

header {
  grid-area: header;
}

main {
  grid-area: main;
}

footer {
  background-color: mintcream;
  grid-area: footer;
}

nav {
  flex-grow: 1;
  margin: 0;
  padding: 20px 0 0 0;
  display: flex;
  justify-content: space-around;
}

nav button {
  list-style: none;
  background-color: lightsteelblue;
  border-radius: 5px;
  text-align: center;
  line-height: 50px;
  box-shadow: 2px 2px 2px #777;
}

nav button:active {
  -webkit-box-shadow: inset 0px 0px 5px #c1c1c1;
  -moz-box-shadow: inset 0px 0px 5px #c1c1c1;
  box-shadow: inset 0px 0px 5px #c1c1c1;
  outline: none;
}

nav button:hover {
  background-color: steelblue;
}

header div {
  display: flex;
  flex-grow: 1;
  align-items: center;
}

header img {
  height: 100px;
  width: auto;
}
header h1 {
  font-size: 2em;
  text-align: center;
  flex-grow: 1;
  color: navy;
}

header {
  grid-area: header;
  align-content: center;
  justify-content: center;
  display: flex;
  background-color: mintcream;
}

header form {
  padding-top: 4px;
  padding-bottom: 4px;
  display: flex;
  align-content: center;
  justify-content: center;
}

header form input {
  height: 20px;
  font-size: larger;
  box-shadow: 2px 2px 2px #777;
}

</style>