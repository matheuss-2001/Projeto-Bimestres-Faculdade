import React from "react";
import { observer } from "mobx-react";
import FormularioPetMatch from "./homeForm";


import './App.css';

class App extends React.Component {


  async componentDidMount() {


    try {
      let res = await fetch("/isLoggedIn", {

        method: "post",
        headers: {
          "Accept": "application/json",
          "Content-Type": "application/json"
        }

      });

      let result = await res.json();

      if (result && result.success) {

        // UserStore.loading = false;
        //UserStore.isLoggedIn = true;
        // UserStore.username = result.username;


      } else {
        //UserStore.loading = false;
        //UserStore.isLoggedIn = false;


      }

    }
    catch (e) {

      // UserStore.loading = false;
      //UserStore.isLoggedIn = false;
    }


  }






  render() {

    if (false) {

      return (
        <div className="app">


          <div className="container"></div>

          Aguarde , carregando...


        </div>
      );



    } else {

      return (
        <div className="app">

          <div className="container">

            <FormularioPetMatch />


          </div>

        </div>
      );

    }



  }


}

export default observer(App);
