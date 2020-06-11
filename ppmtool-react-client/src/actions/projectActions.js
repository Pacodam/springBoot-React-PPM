import axios from "axios";
import { GET_ERRORS, GET_PROJECTS } from "./types";

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

export const getProjects = () => async dispatch => {
  const res = await axios.get(route + "/all")
  dispatch({
    type : GET_PROJECTS,
    payload : res.data
  });
};
