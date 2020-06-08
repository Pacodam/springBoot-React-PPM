import React, { Component } from "react";
import ProjectItem from "./Project/ProjectItem";
import Header from "./Layout/Header";

export default class Dashboard extends Component {
  render() {
    return (
      <div>
        <Header />
        <h1 className="alert alert-warning">Welcome to the Djiashboard</h1>
        <ProjectItem />
      </div>
    );
  }
}

//export default Dashboard;
