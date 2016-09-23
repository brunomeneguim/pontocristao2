package pontocristao.visao;

import java.awt.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.text.*;
import pontocristao.controle.ControleCliente;
import pontocristao.modelo.Sexo;
import pontocristao.util.*;

/**
 *
 * @author Marcondes
 */
public class FrmCadastrarCliente extends javax.swing.JDialog {

    public FrmCadastrarCliente(java.awt.Frame parent, boolean modal, long id) {
        super(parent, modal);
        initComponents();

        //Abrir centralizado
        this.setLocationRelativeTo(null);

        //Dinâmica dos Botões e campos
        txtNome.requestFocus();
        txtCodigo.setEnabled(false);
        jcDataCadastro.setEnabled(false);
        BtnEditar.setEnabled(false);
        BtnExcluir.setEnabled(false);
        txtCpf.setEnabled(false);
        txtRg.setEnabled(false);
        txtCnpj.setEnabled(false);
        jComboSexo.setEnabled(false);

        Utilidades utilidades = new Utilidades();
        Mascara();
        InicializarControle(id);
        teste();

    }
    private static Frame frame;
    private ControleCliente controle;

    public static FrmCadastrarCliente Mostrar(java.awt.Frame parent, long id) {
        frame = parent;
        FrmCadastrarCliente frmCadastrarCliente = new FrmCadastrarCliente(parent, true, id);
        frmCadastrarCliente.setVisible(true);
        return frmCadastrarCliente;
    }

    public void teste() {
        jcDataNascimento.setDate(new Date());
        jcDataCadastro.setDate(new Date());
        txtNome.setText("Bruno");
        txtCpf.setText("07735781962");
        txtRg.setText("124292352");
        txtCnpj.setText("123125481232");
        txtTelefone.setText("4236265335");
        txtCelular.setText("4299227422");
        txtEmail.setText("brunomeneguim@hotmail.com");
        txtCep.setText("85010300");
        txtRua.setText("Quintino Bocaiuva");
        txtNumero.setText("947");
        txtBairro.setText("Centro");
        txtCidade.setText("Guarapuava");
        txtComplemento.setText("Blah");
    }

    public void Mascara() {
        //Setando mascáras para campos 
        MaskFormatter mascara = new Utilidades().setMascara("#####-###");
        mascara.install(txtCep);

        mascara = new Utilidades().setMascara("##.###.###/####-##");
        mascara.install(txtCnpj);

        mascara = new Utilidades().setMascara("(##)####-####");
        mascara.install(txtTelefone);

        mascara = new Utilidades().setMascara("(##)####-####");
        mascara.install(txtCelular);

        mascara = new Utilidades().setMascara("###.###.###-##");
        mascara.install(txtCpf);

        mascara = new Utilidades().setMascara("#########");
        mascara.install(txtRg);
    }

    private void InicializarControle(long id) {
        this.controle = new ControleCliente();

        if (id > 0) {
            Exception erro = this.controle.RecuperarCliente(id);

            if (erro != null) {
                Utilidades.MostrarMensagemErro(erro);
                //fechar a janela com um resultado falso
            } else {
                AtualizarCampos();
            }
        }
    }

    private void AtualizarCampos() {
        txtNome.setText(controle.getCliente().getNome());
        txtCpf.setText(controle.getCliente().getCpf());
        txtRg.setText(controle.getCliente().getRg());
        txtCnpj.setText(controle.getCliente().getCnpj());
        jComboSexo.setSelectedItem(controle.getCliente().getSexo());
        jcDataNascimento.setDate(controle.getCliente().getDataNascimento());
        txtTelefone.setText(controle.getCliente().getTelefoneResidencial());
        txtCelular.setText(controle.getCliente().getCelular());
        txtEmail.setText(controle.getCliente().getEmail());
        txtCep.setText(controle.getCliente().getEndereco().getCep());
        txtRua.setText(controle.getCliente().getEndereco().getRua());
        txtNumero.setText(controle.getCliente().getEndereco().getNumero());
        jComboEstado.setSelectedItem(controle.getCliente().getEndereco().getEstado());
        txtBairro.setText(controle.getCliente().getEndereco().getBairro());
        txtCidade.setText(controle.getCliente().getEndereco().getCidade());
        txtComplemento.setText(controle.getCliente().getEndereco().getComplemento());
    }

    private void AtualizarModelo() {
        controle.getCliente().setNome(txtNome.getText());
        controle.getCliente().setCpf(txtCpf.getText());
        controle.getCliente().setRg(txtRg.getText());
        controle.getCliente().setSexo(Sexo.valueOf(jComboSexo.getSelectedItem().toString()));
        controle.getCliente().setDataNascimento(jcDataNascimento.getDate());
        controle.getCliente().setTelefoneResidencial(txtTelefone.getText());
        controle.getCliente().setCelular(txtCelular.getText());
        controle.getCliente().setEmail(txtEmail.getText());
        controle.getCliente().getEndereco().setCep(txtCep.getText());
        controle.getCliente().getEndereco().setRua(txtRua.getText());
        controle.getCliente().getEndereco().setNumero(txtNumero.getText());
        controle.getCliente().getEndereco().setEstado(jComboEstado.getSelectedItem().toString());
        controle.getCliente().getEndereco().setBairro(txtBairro.getText());
        controle.getCliente().getEndereco().setCidade(txtCidade.getText());
        controle.getCliente().getEndereco().setComplemento(txtComplemento.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGroupTipoCliente = new javax.swing.ButtonGroup();
        pCadastroCliente = new javax.swing.JPanel();
        pInformacoesPessoais = new javax.swing.JPanel();
        lDataCadastro = new javax.swing.JLabel();
        lTelefone = new javax.swing.JLabel();
        lSexo = new javax.swing.JLabel();
        lCodigo = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lNome = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        jComboSexo = new javax.swing.JComboBox<>();
        lRg = new javax.swing.JLabel();
        lDataNascimento = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lCelular = new javax.swing.JLabel();
        lCnpj = new javax.swing.JLabel();
        jcDataNascimento = new com.toedter.calendar.JDateChooser();
        jcDataCadastro = new com.toedter.calendar.JDateChooser();
        txtCpf = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jRadioPessoaJuridica = new javax.swing.JRadioButton();
        jRadioPessoaFisica = new javax.swing.JRadioButton();
        pEndereco = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jComboEstado = new javax.swing.JComboBox<>();
        txtComplemento = new javax.swing.JTextField();
        lEstado = new javax.swing.JLabel();
        lNumero = new javax.swing.JLabel();
        lRua = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lComplemento = new javax.swing.JLabel();
        lCep = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lBairro = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        BtnConsultarCep = new javax.swing.JButton();
        txtCep = new javax.swing.JFormattedTextField();
        pCadastroDependente = new javax.swing.JPanel();
        BtnNovo = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDependente = new javax.swing.JTable();
        BtnConfirmar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        pCadastroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pInformacoesPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));

        lDataCadastro.setText("Data do Cadastro");

        lTelefone.setText("Telefone");

        lSexo.setText("Sexo");

        lCodigo.setText("Código");

        lCpf.setText("CPF");

        lNome.setText("Nome");

        lEmail.setText("E-mail");

        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));

        lRg.setText("RG");

        lDataNascimento.setText("Data de Nascimento");

        lCelular.setText("Celular");

        lCnpj.setText("CNPJ");

        jButtonGroupTipoCliente.add(jRadioPessoaJuridica);
        jRadioPessoaJuridica.setText("Pessoa Jurídica");
        jRadioPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPessoaJuridicaActionPerformed(evt);
            }
        });

        jButtonGroupTipoCliente.add(jRadioPessoaFisica);
        jRadioPessoaFisica.setSelected(true);
        jRadioPessoaFisica.setText("Pessoa Física");
        jRadioPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPessoaFisicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInformacoesPessoaisLayout = new javax.swing.GroupLayout(pInformacoesPessoais);
        pInformacoesPessoais.setLayout(pInformacoesPessoaisLayout);
        pInformacoesPessoaisLayout.setHorizontalGroup(
            pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInformacoesPessoaisLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lCnpj))
                                        .addGap(22, 22, 22)
                                        .addComponent(lSexo)
                                        .addGap(259, 259, 259))
                                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                                .addComponent(lEmail)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtEmail)))))
                            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lCpf)
                                            .addComponent(lTelefone))
                                        .addGap(126, 126, 126)
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lCelular)
                                            .addComponent(lRg))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                                .addComponent(lCodigo)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lNome)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lDataNascimento)
                                    .addComponent(jcDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(jcDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jRadioPessoaFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioPessoaJuridica)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pInformacoesPessoaisLayout.setVerticalGroup(
            pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioPessoaJuridica)
                    .addComponent(jRadioPessoaFisica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNome)
                        .addComponent(lDataNascimento))
                    .addComponent(lCodigo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lCpf)
                        .addComponent(lRg)
                        .addComponent(lCnpj)
                        .addComponent(lDataCadastro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCnpj))
                    .addComponent(jcDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefone)
                    .addComponent(lCelular)
                    .addComponent(lEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addGroup(pInformacoesPessoaisLayout.createSequentialGroup()
                        .addGroup(pInformacoesPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lEstado.setText("Estado");

        lNumero.setText("Número");

        lRua.setText("Rua");

        lComplemento.setText("Complemento");

        lCep.setText("CEP");

        lBairro.setText("Bairro");

        lCidade.setText("Cidade");

        BtnConsultarCep.setText("Consultar");
        BtnConsultarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEnderecoLayout = new javax.swing.GroupLayout(pEndereco);
        pEndereco.setLayout(pEnderecoLayout);
        pEnderecoLayout.setHorizontalGroup(
            pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEnderecoLayout.createSequentialGroup()
                        .addComponent(lCep)
                        .addGap(483, 483, 483)
                        .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lEstado)
                            .addComponent(jComboEstado, 0, 142, Short.MAX_VALUE)))
                    .addGroup(pEnderecoLayout.createSequentialGroup()
                        .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplemento)
                            .addGroup(pEnderecoLayout.createSequentialGroup()
                                .addComponent(lComplemento)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pEnderecoLayout.createSequentialGroup()
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnConsultarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lRua)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pEnderecoLayout.setVerticalGroup(
            pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCep)
                    .addComponent(lRua)
                    .addComponent(lNumero)
                    .addComponent(lEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultarCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBairro)
                    .addComponent(lCidade)
                    .addComponent(lComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pCadastroClienteLayout = new javax.swing.GroupLayout(pCadastroCliente);
        pCadastroCliente.setLayout(pCadastroClienteLayout);
        pCadastroClienteLayout.setHorizontalGroup(
            pCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroClienteLayout.createSequentialGroup()
                .addGroup(pCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pInformacoesPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCadastroClienteLayout.setVerticalGroup(
            pCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastroClienteLayout.createSequentialGroup()
                .addComponent(pInformacoesPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pCadastroDependente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dependentes"));

        BtnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnNovo.png"))); // NOI18N
        BtnNovo.setText("Novo");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnExcluir.png"))); // NOI18N
        BtnExcluir.setText("Excluir");

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnEditar.png"))); // NOI18N
        BtnEditar.setText("Editar");

        jTableDependente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDependente);

        javax.swing.GroupLayout pCadastroDependenteLayout = new javax.swing.GroupLayout(pCadastroDependente);
        pCadastroDependente.setLayout(pCadastroDependenteLayout);
        pCadastroDependenteLayout.setHorizontalGroup(
            pCadastroDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroDependenteLayout.createSequentialGroup()
                .addComponent(BtnNovo)
                .addGap(18, 18, 18)
                .addComponent(BtnEditar)
                .addGap(18, 18, 18)
                .addComponent(BtnExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pCadastroDependenteLayout.setVerticalGroup(
            pCadastroDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastroDependenteLayout.createSequentialGroup()
                .addGroup(pCadastroDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnConfirmar.png"))); // NOI18N
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnCancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCadastroDependente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCadastroDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
        FrmCadastrarDependente frmCadastrarDependente = FrmCadastrarDependente.Mostrar(frame);
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null,
                "Deseja Cancelar o Cadastro do Cliente? ",
                "Confirmação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                botoes, botoes[0]);
        if (resposta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null,
                "Deseja Finalizar o Cadastro do Cliente? ",
                "Confirmação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                botoes, botoes[0]);
        if (resposta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void jRadioPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPessoaFisicaActionPerformed
        txtCpf.setEnabled(true);
        txtRg.setEnabled(true);
        jComboSexo.setEnabled(true);
        txtCnpj.setText("");
        txtCnpj.setEnabled(false);
        jcDataNascimento.setEnabled(true);
    }//GEN-LAST:event_jRadioPessoaFisicaActionPerformed

    private void jRadioPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPessoaJuridicaActionPerformed
        txtCnpj.setEnabled(true);
        txtCpf.setText("");
        txtCpf.setEnabled(false);
        txtRg.setText("");
        txtRg.setEnabled(false);
        jComboSexo.setEnabled(false);
        jComboSexo.setSelectedItem("Feminino");
        jcDataNascimento.setEnabled(false);
    }//GEN-LAST:event_jRadioPessoaJuridicaActionPerformed

    private void BtnConsultarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarCepActionPerformed
        BuscaCep(txtCep.getText().toString());
        txtNumero.requestFocus();
    }//GEN-LAST:event_BtnConsultarCepActionPerformed

    public void BuscaCep(String cep) {
        try {

            CepWebService cepWebService = new CepWebService(cep);

            if (cepWebService.getResultado() == 1) {

                txtRua.setText(cepWebService.getLogradouro());
                txtBairro.setText(cepWebService.getBairro());
                txtCidade.setText(cepWebService.getCidade());
                jComboEstado.setSelectedItem(cepWebService.getEstado());
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o endereço", "Procura do endereço", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o endereço", "Procura do endereço", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadastrarCliente dialog = new FrmCadastrarCliente(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnConsultarCep;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovo;
    private javax.swing.ButtonGroup jButtonGroupTipoCliente;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JRadioButton jRadioPessoaFisica;
    private javax.swing.JRadioButton jRadioPessoaJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDependente;
    private com.toedter.calendar.JDateChooser jcDataCadastro;
    private com.toedter.calendar.JDateChooser jcDataNascimento;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lCelular;
    private javax.swing.JLabel lCep;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lCnpj;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lComplemento;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lDataCadastro;
    private javax.swing.JLabel lDataNascimento;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lRg;
    private javax.swing.JLabel lRua;
    private javax.swing.JLabel lSexo;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JPanel pCadastroCliente;
    private javax.swing.JPanel pCadastroDependente;
    private javax.swing.JPanel pEndereco;
    private javax.swing.JPanel pInformacoesPessoais;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
