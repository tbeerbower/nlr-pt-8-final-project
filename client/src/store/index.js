import { createStore as _createStore } from 'vuex';
import axios from 'axios';

export function createStore(currentToken, currentUser) {
  let store = _createStore({
    state: {
      collections: [],
      dictionaries: [],
      entries: [],
      token: currentToken || '',
      user: currentUser || {},
    },
    mutations: {
      SET_COLLECTIONS(state, collections) {
        state.collections = collections;
      },
      SET_DICTIONARIES(state, dictionaries) {
        state.dictionaries = dictionaries;
      },
      SET_ENTRIES(state, entries) {
        state.entries = entries;
      },
      SET_AUTH_TOKEN(state, token) {
        state.token = token;
        localStorage.setItem('token', token);
        axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
      },
      SET_USER(state, user) {
        state.user = user;
        localStorage.setItem('user', JSON.stringify(user));
      },
      LOGOUT(state) {
        localStorage.removeItem('token');
        localStorage.removeItem('user');
        state.token = '';
        state.user = {};
        axios.defaults.headers.common = {};
      }
    },

  })
  return store;
}