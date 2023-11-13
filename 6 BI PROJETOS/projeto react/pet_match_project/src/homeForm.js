import React from "react";
import InputField from "./inputField";
import SubmitButton from "./submitButton";



//require("dotenv").config();


/*

const express = require("express");
const app = express();
app.use(express.json());
const { OpenAI } = require("openai");
const openai = new OpenAI(OPENAI_API_KEY);
*/




    






class FormularioPetMatch extends React.Component {

  constructor(props) {
    super(props);
    this.state = {

      name: "",
      idade: "",
      rotina: "",
      tipoPet: "",
      cidade: "",
      question: "",
      buttonDisabled: false
    }

    this.changePetValue = this.changePetValue.bind(this);

  }


  setInputValue(property, val) {
    val = val.trim();

    this.setState({
      [property]: val
    })

  }



  changePetValue(event) {

    this.setState({
      tipoPet: event.target.value,
    });






  }



  async findMatch() {



    if (this.state.name !== "" &&
      this.state.idade !== "" &&
      this.state.cidade !== "" &&
      this.state.rotina !== "" &&

      (this.state.tipoPet !== "" && this.state.tipoPet !== "selecione")) {


      this.question = `cite as raças de ${this.state.tipoPet} que mais combinariam com as especificacoes seguintes :  dono idade ${this.state.idade} , rotina ${this.state.rotina}, moro em ${this.state.cidade}`;


      try {
/*
        app.post("/pergunte-ao-chatgpt", async (req, res) => {
          const { prompt } = this.state.question;

          const model = "gpt-3.5-turbo";
          const role = "user";
          const max_tokens = 2000;

          const completion = await openai.chat.completions.create({
            messages: [{ role: role, content: prompt }],
            model: model,
            max_tokens: max_tokens
          });

          res.json({ completion: completion.choices[0].message.content })
        });

        const PORT = 4000;
        app.listen(PORT, () => console.log(`Em execução na porta ${PORT}`));


*/



        /*
                let res = await fetch("/pergunte-ao-chatgpt", {
        
                  method: "post",
                  headers: {
                    "Accept": "application/json",
                    "Content-Type": "application/json"
                  },
        
        
                  body: JSON.stringify({
        
                    username: this.state.username,
               
        
        
                  })
        
                });
        
        
                let result = await res.json();
        
                if (result && result.success) {
        
                  //UserStore.isLoggedIn = true;
                  //UserStore.username = result.username;
        
                } else if (result && result.success === false) {
        
                  this.resetForm();
                  alert(result.msg);
                }
        
        
        
                */

      

      }
      catch (e) {

        alert("Algo deu errado durante a busca");

      }


    } else {
      alert("Preencha todos os campos");
    }














  }

  render() {

    return (
      <div className="loginForm">

        <h4>Pet Match</h4>
        <h6>Preencha as infomacoes abaixo para encontrar um Pet que mais combina com seu estilo de vida.</h6>


        <img
          style={{ width: 400, height: 160 }}

          src="https://www.vetvoice.com.au/imagevault/publishedmedia/6jx0ogesil26qet49xaz/dog_-_cat.jpg" />





        <InputField

          type="text"
          placeholder="Nome Completo"
          value={this.state.name ? this.state.name : ""}
          onChange={(val) => this.setInputValue("name", val)}

        />

        <InputField

          type="text"//"date"
          placeholder="Idade"
          value={this.state.idade ? this.state.idade : ""}
          onChange={(val) => this.setInputValue("idade", val)}

        />

        <InputField

          type="text"
          placeholder="Cidade de residencia"
          value={this.state.cidade ? this.state.cidade : ""}
          onChange={(val) => this.setInputValue("cidade", val)}

        />




        <div className="inputField">


          <select
            className="inputTipoPet"
            value={this.state.tipoPet} onChange={this.changePetValue}
          >

            <option value="selecione">Selecione</option>
            <option value="cachorro">Cachorro</option>
            <option value="gato">Gato</option>

          </select>


        </div>











        <div className="inputField">

          <input
            className="inputRotina"
            type="text"
            placeholder="Descreva de maneira breve sua rotina"
            value={this.state.rotina ? this.state.rotina : ""}
            onChange={(val) => this.setInputValue("rotina", val.target.value)}

          >
          </input>

        </div>






        <SubmitButton

          text="Buscar Match"
          disabled={this.state.buttonDisabled}
          onClick={()=>this.findMatch()}


        />







      </div>
    );
  }


}

export default FormularioPetMatch;
