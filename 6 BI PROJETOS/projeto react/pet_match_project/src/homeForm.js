import React from "react";
import InputField from "./inputField";
import SubmitButton from "./submitButton";



const API_KEY = "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";












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


      this.question = `cite as raças de ${this.state.tipoPet} que mais combinariam com as especificacoes seguintes :  dono idade ${this.state.idade} , rotina ${this.state.rotina}, reside em ${this.state.cidade}`;





      try {





        const apiRequestBody = {
          "model": "gpt-3.5-turbo",
          "messages": [
            { "role": "user", "content": this.question }

          ]
        }

        console.log(apiRequestBody);

        await fetch("https://api.openai.com/v1/chat/completions", {

          method: "POST",
          headers: {
            "Authorization": "Bearer " + API_KEY,
            "Content-Type": "application/json",
          },

          body: JSON.stringify(apiRequestBody)
        }).then((data) => {
          return data.json();
        }).then((data) => {
          console.log(data["choices"][0]["message"]["content"]);
          alert(data["choices"][0]["message"]["content"]);


        })
















      } catch (e) {

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
          onClick={() => this.findMatch()}


        />







      </div>
    );
  }


}

export default FormularioPetMatch;
