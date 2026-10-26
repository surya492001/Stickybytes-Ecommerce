import axios from "axios";

const apiClient = axios.create({
  baseURL: import.meta.env.VITE_API_Base_URL, // Replace with your API base URL
  timeout: 10000, // Set a timeout for requests (in milliseconds)
  headers: {
    "Content-Type": "application/json",
  },
});

export default apiClient;