import axios from "axios";
import { GET_ERRORS } from "./types";

const route = "http://localhost:8080/api/project";
export const createProject = (project, history) => async (dispatch) => {
  try {

    const res = await axios.post(route, project);
    history.push("/dashboard");
    console.log(res);

  } catch (err) {
    dispatch({
      type: GET_ERRORS,
      payload: err.response.data,
    });
  }
};
