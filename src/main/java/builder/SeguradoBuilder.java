package builder;

import java.util.Date;

public class SeguradoBuilder {

    private Segurado segurado;

    public SeguradoBuilder() {
        segurado = new Segurado();
    }

    public Segurado build() {
        if (segurado.getCpf().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (segurado.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return segurado;
    }

    public SeguradoBuilder setNome(String nome) {
        segurado.setNome(nome);
        return this;
    }

    public SeguradoBuilder setDataNascimento(Date dataNascimento) {
        segurado.setDataNascimento(dataNascimento);
        return this;
    }

    public SeguradoBuilder setCpf(String cpf) {
        segurado.setCpf(cpf);
        return this;
    }

    public SeguradoBuilder setRg(String rg) {
        segurado.setRg(rg);
        return this;
    }

    public SeguradoBuilder setProfissao(String profissao) {
        segurado.setProfissao(profissao);
        return this;
    }

    public SeguradoBuilder setEstadoCivil(String estadoCivil) {
        segurado.setEstadoCivil(estadoCivil);
        return this;
    }

    public SeguradoBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        segurado.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public SeguradoBuilder setEnderecoNumero(int enderecoNumero) {
        segurado.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public SeguradoBuilder setEnderecoComplemento(String enderecoComplemento) {
        segurado.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public SeguradoBuilder setEnderecoBairro(String enderecoBairro) {
        segurado.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public SeguradoBuilder setEnderecoCidade(String enderecoCidade) {
        segurado.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public SeguradoBuilder setEnderecoUF(String enderecoUF) {
        segurado.setEnderecoUF(enderecoUF);
        return this;
    }

    public SeguradoBuilder setCep(String cep) {
        segurado.setCep(cep);
        return this;
    }

    public SeguradoBuilder setEmail(String email) {
        segurado.setEmail(email);
        return this;
    }

    public SeguradoBuilder setCelular(String celular) {
        segurado.setCelular(celular);
        return this;
    }

}
