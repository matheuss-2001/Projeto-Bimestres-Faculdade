import React from "react";
import UserSotre from "./stores/UserStore";

import { observer } from "mobx-react";

import LoginForm from "./LoginForm";
import InputField from "./InputField";
import SubmitButtonm from "./SubmitButton";

import './App.css';

class App extends React.Component {

  async componentDidMount() {


    try {
      let res = await fetch("/isLoggedIn", {

        method: "post",
        headers: {
          "Accept": "application/json",
          "Content-type": "application/json"
        }

      });

      let result = await res.json();

      if (result && result.success) {

        UserSotre.loading = false;
        UserSotre.isLoggedIn = true;
        UserSotre.username = result.username;


      } else {
        UserSotre.loading = false;
        UserSotre.isLoggedIn = false;


      }

    }
    catch (e) {

      UserSotre.loading = false;
      UserSotre.isLoggedIn = false;
    }


  }


  async doLogout() {


    try {
      let res = await fetch("/logout", {

        method: "post",
        headers: {
          "Accept": "application/json",
          "Content-type": "application/json"
        }

      });

      let result = await res.json();

      if (result && result.success) {

        UserSotre.loading = false;
        UserSotre.isLoggedIn = false;
        UserSotre.username = "";


      }

    }
    catch (e) {

      console.log(e);
    }


  }



  render() {

    if (UserSotre.loading) {

      return (
        <div className="app">


          <div className="container"></div>

          Aguarde , carregando...


        </div>
      );



    } else {

      if (UserSotre.isLoggedIn) {

        return (
          <div className="app">


            <div className="container"></div>

            Seja bem-vindo {UserSotre.username}

            <SubmitButtonm

              text={"Logout"}
              disable={false}
              onClick={() => this.doLogout()}

            />


          </div>
        );





      }
      return (
        <div className="app">

          <div className="container">

            <LoginForm />


          </div>

        </div>
      );

    }



  }


}

export default observer(App);
