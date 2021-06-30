package br.inf.cs.model;

import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ID_PRODUTO;
    private String EAN;
    private String REGISTRO_ANVISA;
    private String GGREM;
    private String NOME;
    private String DESCRICAO;
    private String COMPOSICAO;
    private String QTD_EMBALAGEM;
    private String PF_20;
    private String PMC_20;
    private String PF_18;
    private String PMC_18;
    private String PF_17;
    private String PMC_17;
    private String PF_17_5;
    private String PMC_17_5;
    private String PF_12;
    private String PMC_12;
    private String PF_0;
    private String PMC_0;
    private String PERCENTUAL_IPI;
    private String DATA_VIGENCIA;
    private String NOVO;
    private String VARIACAO_PRECO;
    private String PF_17_ALC;
    private String PMC_17_ALC;
    private String PF_17_5_ALC;
    private String PMC_17_5_ALC;
    private String PF_18_ALC;
    private String PMC_18_ALC;
    private String NCM;
    private String ID_TARJA;
    private String CLASSE_TERAPEUTICA;
    private String PORTARIA_344_98;
    private String PRODUTO_REFERENCIA;
    private String CAS;
    private String DCB;
    private String ATC_CODE;
    private String CAP;
    private String CONFAZ_87;
    private String TISS_TUSS;
    private String CEST;
    private String ID_FABRICANTE;
    private String NOME_FABRICANTE;
    private String ID_LCCT;
    private String DESCRICAO_LISTA;
    private String ID_REGIME_PRECO;
    private String DESCRICAO_REGIME_PRECO;
    private String ID_TIPO_PRODUTO;
    private String DESCRICAO_TIPO_PRODUTO;

    public Produto() {
    }

    public Produto(String ID_PRODUTO, String EAN, String REGISTRO_ANVISA, String GGREM, String NOME, String DESCRICAO,
            String COMPOSICAO, String QTD_EMBALAGEM, String PF_20, String PMC_20, String PF_18, String PMC_18,
            String PF_17, String PMC_17, String PF_17_5, String PMC_17_5, String PF_12, String PMC_12, String PF_0,
            String PMC_0, String PERCENTUAL_IPI, String DATA_VIGENCIA, String NOVO, String VARIACAO_PRECO,
            String PF_17_ALC, String PMC_17_ALC, String PF_17_5_ALC, String PMC_17_5_ALC, String PF_18_ALC,
            String PMC_18_ALC, String NCM, String ID_TARJA, String CLASSE_TERAPEUTICA, String PORTARIA_344_98,
            String PRODUTO_REFERENCIA, String CAS, String DCB, String ATC_CODE, String CAP, String CONFAZ_87,
            String TISS_TUSS, String CEST, String ID_FABRICANTE, String NOME_FABRICANTE, String ID_LCCT,
            String DESCRICAO_LISTA, String ID_REGIME_PRECO, String DESCRICAO_REGIME_PRECO, String ID_TIPO_PRODUTO,
            String DESCRICAO_TIPO_PRODUTO) {
        this.ID_PRODUTO = ID_PRODUTO;
        this.EAN = EAN;
        this.REGISTRO_ANVISA = REGISTRO_ANVISA;
        this.GGREM = GGREM;
        this.NOME = NOME;
        this.DESCRICAO = DESCRICAO;
        this.COMPOSICAO = COMPOSICAO;
        this.QTD_EMBALAGEM = QTD_EMBALAGEM;
        this.PF_20 = PF_20;
        this.PMC_20 = PMC_20;
        this.PF_18 = PF_18;
        this.PMC_18 = PMC_18;
        this.PF_17 = PF_17;
        this.PMC_17 = PMC_17;
        this.PF_17_5 = PF_17_5;
        this.PMC_17_5 = PMC_17_5;
        this.PF_12 = PF_12;
        this.PMC_12 = PMC_12;
        this.PF_0 = PF_0;
        this.PMC_0 = PMC_0;
        this.PERCENTUAL_IPI = PERCENTUAL_IPI;
        this.DATA_VIGENCIA = DATA_VIGENCIA;
        this.NOVO = NOVO;
        this.VARIACAO_PRECO = VARIACAO_PRECO;
        this.PF_17_ALC = PF_17_ALC;
        this.PMC_17_ALC = PMC_17_ALC;
        this.PF_17_5_ALC = PF_17_5_ALC;
        this.PMC_17_5_ALC = PMC_17_5_ALC;
        this.PF_18_ALC = PF_18_ALC;
        this.PMC_18_ALC = PMC_18_ALC;
        this.NCM = NCM;
        this.ID_TARJA = ID_TARJA;
        this.CLASSE_TERAPEUTICA = CLASSE_TERAPEUTICA;
        this.PORTARIA_344_98 = PORTARIA_344_98;
        this.PRODUTO_REFERENCIA = PRODUTO_REFERENCIA;
        this.CAS = CAS;
        this.DCB = DCB;
        this.ATC_CODE = ATC_CODE;
        this.CAP = CAP;
        this.CONFAZ_87 = CONFAZ_87;
        this.TISS_TUSS = TISS_TUSS;
        this.CEST = CEST;
        this.ID_FABRICANTE = ID_FABRICANTE;
        this.NOME_FABRICANTE = NOME_FABRICANTE;
        this.ID_LCCT = ID_LCCT;
        this.DESCRICAO_LISTA = DESCRICAO_LISTA;
        this.ID_REGIME_PRECO = ID_REGIME_PRECO;
        this.DESCRICAO_REGIME_PRECO = DESCRICAO_REGIME_PRECO;
        this.ID_TIPO_PRODUTO = ID_TIPO_PRODUTO;
        this.DESCRICAO_TIPO_PRODUTO = DESCRICAO_TIPO_PRODUTO;
    }

    public String getID_PRODUTO() {
        return this.ID_PRODUTO;
    }

    public void setID_PRODUTO(String ID_PRODUTO) {
        this.ID_PRODUTO = ID_PRODUTO;
    }

    public String getEAN() {
        return this.EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    public String getREGISTRO_ANVISA() {
        return this.REGISTRO_ANVISA;
    }

    public void setREGISTRO_ANVISA(String REGISTRO_ANVISA) {
        this.REGISTRO_ANVISA = REGISTRO_ANVISA;
    }

    public String getGGREM() {
        return this.GGREM;
    }

    public void setGGREM(String GGREM) {
        this.GGREM = GGREM;
    }

    public String getNOME() {
        return this.NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getDESCRICAO() {
        return this.DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public String getCOMPOSICAO() {
        return this.COMPOSICAO;
    }

    public void setCOMPOSICAO(String COMPOSICAO) {
        this.COMPOSICAO = COMPOSICAO;
    }

    public String getQTD_EMBALAGEM() {
        return this.QTD_EMBALAGEM;
    }

    public void setQTD_EMBALAGEM(String QTD_EMBALAGEM) {
        this.QTD_EMBALAGEM = QTD_EMBALAGEM;
    }

    public String getPF_20() {
        return this.PF_20;
    }

    public void setPF_20(String PF_20) {
        this.PF_20 = PF_20;
    }

    public String getPMC_20() {
        return this.PMC_20;
    }

    public void setPMC_20(String PMC_20) {
        this.PMC_20 = PMC_20;
    }

    public String getPF_18() {
        return this.PF_18;
    }

    public void setPF_18(String PF_18) {
        this.PF_18 = PF_18;
    }

    public String getPMC_18() {
        return this.PMC_18;
    }

    public void setPMC_18(String PMC_18) {
        this.PMC_18 = PMC_18;
    }

    public String getPF_17() {
        return this.PF_17;
    }

    public void setPF_17(String PF_17) {
        this.PF_17 = PF_17;
    }

    public String getPMC_17() {
        return this.PMC_17;
    }

    public void setPMC_17(String PMC_17) {
        this.PMC_17 = PMC_17;
    }

    public String getPF_17_5() {
        return this.PF_17_5;
    }

    public void setPF_17_5(String PF_17_5) {
        this.PF_17_5 = PF_17_5;
    }

    public String getPMC_17_5() {
        return this.PMC_17_5;
    }

    public void setPMC_17_5(String PMC_17_5) {
        this.PMC_17_5 = PMC_17_5;
    }

    public String getPF_12() {
        return this.PF_12;
    }

    public void setPF_12(String PF_12) {
        this.PF_12 = PF_12;
    }

    public String getPMC_12() {
        return this.PMC_12;
    }

    public void setPMC_12(String PMC_12) {
        this.PMC_12 = PMC_12;
    }

    public String getPF_0() {
        return this.PF_0;
    }

    public void setPF_0(String PF_0) {
        this.PF_0 = PF_0;
    }

    public String getPMC_0() {
        return this.PMC_0;
    }

    public void setPMC_0(String PMC_0) {
        this.PMC_0 = PMC_0;
    }

    public String getPERCENTUAL_IPI() {
        return this.PERCENTUAL_IPI;
    }

    public void setPERCENTUAL_IPI(String PERCENTUAL_IPI) {
        this.PERCENTUAL_IPI = PERCENTUAL_IPI;
    }

    public String getDATA_VIGENCIA() {
        return this.DATA_VIGENCIA;
    }

    public void setDATA_VIGENCIA(String DATA_VIGENCIA) {
        this.DATA_VIGENCIA = DATA_VIGENCIA;
    }

    public String getNOVO() {
        return this.NOVO;
    }

    public void setNOVO(String NOVO) {
        this.NOVO = NOVO;
    }

    public String getVARIACAO_PRECO() {
        return this.VARIACAO_PRECO;
    }

    public void setVARIACAO_PRECO(String VARIACAO_PRECO) {
        this.VARIACAO_PRECO = VARIACAO_PRECO;
    }

    public String getPF_17_ALC() {
        return this.PF_17_ALC;
    }

    public void setPF_17_ALC(String PF_17_ALC) {
        this.PF_17_ALC = PF_17_ALC;
    }

    public String getPMC_17_ALC() {
        return this.PMC_17_ALC;
    }

    public void setPMC_17_ALC(String PMC_17_ALC) {
        this.PMC_17_ALC = PMC_17_ALC;
    }

    public String getPF_17_5_ALC() {
        return this.PF_17_5_ALC;
    }

    public void setPF_17_5_ALC(String PF_17_5_ALC) {
        this.PF_17_5_ALC = PF_17_5_ALC;
    }

    public String getPMC_17_5_ALC() {
        return this.PMC_17_5_ALC;
    }

    public void setPMC_17_5_ALC(String PMC_17_5_ALC) {
        this.PMC_17_5_ALC = PMC_17_5_ALC;
    }

    public String getPF_18_ALC() {
        return this.PF_18_ALC;
    }

    public void setPF_18_ALC(String PF_18_ALC) {
        this.PF_18_ALC = PF_18_ALC;
    }

    public String getPMC_18_ALC() {
        return this.PMC_18_ALC;
    }

    public void setPMC_18_ALC(String PMC_18_ALC) {
        this.PMC_18_ALC = PMC_18_ALC;
    }

    public String getNCM() {
        return this.NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public String getID_TARJA() {
        return this.ID_TARJA;
    }

    public void setID_TARJA(String ID_TARJA) {
        this.ID_TARJA = ID_TARJA;
    }

    public String getCLASSE_TERAPEUTICA() {
        return this.CLASSE_TERAPEUTICA;
    }

    public void setCLASSE_TERAPEUTICA(String CLASSE_TERAPEUTICA) {
        this.CLASSE_TERAPEUTICA = CLASSE_TERAPEUTICA;
    }

    public String getPORTARIA_344_98() {
        return this.PORTARIA_344_98;
    }

    public void setPORTARIA_344_98(String PORTARIA_344_98) {
        this.PORTARIA_344_98 = PORTARIA_344_98;
    }

    public String getPRODUTO_REFERENCIA() {
        return this.PRODUTO_REFERENCIA;
    }

    public void setPRODUTO_REFERENCIA(String PRODUTO_REFERENCIA) {
        this.PRODUTO_REFERENCIA = PRODUTO_REFERENCIA;
    }

    public String getCAS() {
        return this.CAS;
    }

    public void setCAS(String CAS) {
        this.CAS = CAS;
    }

    public String getDCB() {
        return this.DCB;
    }

    public void setDCB(String DCB) {
        this.DCB = DCB;
    }

    public String getATC_CODE() {
        return this.ATC_CODE;
    }

    public void setATC_CODE(String ATC_CODE) {
        this.ATC_CODE = ATC_CODE;
    }

    public String getCAP() {
        return this.CAP;
    }

    public void setCAP(String CAP) {
        this.CAP = CAP;
    }

    public String getCONFAZ_87() {
        return this.CONFAZ_87;
    }

    public void setCONFAZ_87(String CONFAZ_87) {
        this.CONFAZ_87 = CONFAZ_87;
    }

    public String getTISS_TUSS() {
        return this.TISS_TUSS;
    }

    public void setTISS_TUSS(String TISS_TUSS) {
        this.TISS_TUSS = TISS_TUSS;
    }

    public String getCEST() {
        return this.CEST;
    }

    public void setCEST(String CEST) {
        this.CEST = CEST;
    }

    public String getID_FABRICANTE() {
        return this.ID_FABRICANTE;
    }

    public void setID_FABRICANTE(String ID_FABRICANTE) {
        this.ID_FABRICANTE = ID_FABRICANTE;
    }

    public String getNOME_FABRICANTE() {
        return this.NOME_FABRICANTE;
    }

    public void setNOME_FABRICANTE(String NOME_FABRICANTE) {
        this.NOME_FABRICANTE = NOME_FABRICANTE;
    }

    public String getID_LCCT() {
        return this.ID_LCCT;
    }

    public void setID_LCCT(String ID_LCCT) {
        this.ID_LCCT = ID_LCCT;
    }

    public String getDESCRICAO_LISTA() {
        return this.DESCRICAO_LISTA;
    }

    public void setDESCRICAO_LISTA(String DESCRICAO_LISTA) {
        this.DESCRICAO_LISTA = DESCRICAO_LISTA;
    }

    public String getID_REGIME_PRECO() {
        return this.ID_REGIME_PRECO;
    }

    public void setID_REGIME_PRECO(String ID_REGIME_PRECO) {
        this.ID_REGIME_PRECO = ID_REGIME_PRECO;
    }

    public String getDESCRICAO_REGIME_PRECO() {
        return this.DESCRICAO_REGIME_PRECO;
    }

    public void setDESCRICAO_REGIME_PRECO(String DESCRICAO_REGIME_PRECO) {
        this.DESCRICAO_REGIME_PRECO = DESCRICAO_REGIME_PRECO;
    }

    public String getID_TIPO_PRODUTO() {
        return this.ID_TIPO_PRODUTO;
    }

    public void setID_TIPO_PRODUTO(String ID_TIPO_PRODUTO) {
        this.ID_TIPO_PRODUTO = ID_TIPO_PRODUTO;
    }

    public String getDESCRICAO_TIPO_PRODUTO() {
        return this.DESCRICAO_TIPO_PRODUTO;
    }

    public void setDESCRICAO_TIPO_PRODUTO(String DESCRICAO_TIPO_PRODUTO) {
        this.DESCRICAO_TIPO_PRODUTO = DESCRICAO_TIPO_PRODUTO;
    }

    public Produto ID_PRODUTO(String ID_PRODUTO) {
        setID_PRODUTO(ID_PRODUTO);
        return this;
    }

    public Produto EAN(String EAN) {
        setEAN(EAN);
        return this;
    }

    public Produto REGISTRO_ANVISA(String REGISTRO_ANVISA) {
        setREGISTRO_ANVISA(REGISTRO_ANVISA);
        return this;
    }

    public Produto GGREM(String GGREM) {
        setGGREM(GGREM);
        return this;
    }

    public Produto NOME(String NOME) {
        setNOME(NOME);
        return this;
    }

    public Produto DESCRICAO(String DESCRICAO) {
        setDESCRICAO(DESCRICAO);
        return this;
    }

    public Produto COMPOSICAO(String COMPOSICAO) {
        setCOMPOSICAO(COMPOSICAO);
        return this;
    }

    public Produto QTD_EMBALAGEM(String QTD_EMBALAGEM) {
        setQTD_EMBALAGEM(QTD_EMBALAGEM);
        return this;
    }

    public Produto PF_20(String PF_20) {
        setPF_20(PF_20);
        return this;
    }

    public Produto PMC_20(String PMC_20) {
        setPMC_20(PMC_20);
        return this;
    }

    public Produto PF_18(String PF_18) {
        setPF_18(PF_18);
        return this;
    }

    public Produto PMC_18(String PMC_18) {
        setPMC_18(PMC_18);
        return this;
    }

    public Produto PF_17(String PF_17) {
        setPF_17(PF_17);
        return this;
    }

    public Produto PMC_17(String PMC_17) {
        setPMC_17(PMC_17);
        return this;
    }

    public Produto PF_17_5(String PF_17_5) {
        setPF_17_5(PF_17_5);
        return this;
    }

    public Produto PMC_17_5(String PMC_17_5) {
        setPMC_17_5(PMC_17_5);
        return this;
    }

    public Produto PF_12(String PF_12) {
        setPF_12(PF_12);
        return this;
    }

    public Produto PMC_12(String PMC_12) {
        setPMC_12(PMC_12);
        return this;
    }

    public Produto PF_0(String PF_0) {
        setPF_0(PF_0);
        return this;
    }

    public Produto PMC_0(String PMC_0) {
        setPMC_0(PMC_0);
        return this;
    }

    public Produto PERCENTUAL_IPI(String PERCENTUAL_IPI) {
        setPERCENTUAL_IPI(PERCENTUAL_IPI);
        return this;
    }

    public Produto DATA_VIGENCIA(String DATA_VIGENCIA) {
        setDATA_VIGENCIA(DATA_VIGENCIA);
        return this;
    }

    public Produto NOVO(String NOVO) {
        setNOVO(NOVO);
        return this;
    }

    public Produto VARIACAO_PRECO(String VARIACAO_PRECO) {
        setVARIACAO_PRECO(VARIACAO_PRECO);
        return this;
    }

    public Produto PF_17_ALC(String PF_17_ALC) {
        setPF_17_ALC(PF_17_ALC);
        return this;
    }

    public Produto PMC_17_ALC(String PMC_17_ALC) {
        setPMC_17_ALC(PMC_17_ALC);
        return this;
    }

    public Produto PF_17_5_ALC(String PF_17_5_ALC) {
        setPF_17_5_ALC(PF_17_5_ALC);
        return this;
    }

    public Produto PMC_17_5_ALC(String PMC_17_5_ALC) {
        setPMC_17_5_ALC(PMC_17_5_ALC);
        return this;
    }

    public Produto PF_18_ALC(String PF_18_ALC) {
        setPF_18_ALC(PF_18_ALC);
        return this;
    }

    public Produto PMC_18_ALC(String PMC_18_ALC) {
        setPMC_18_ALC(PMC_18_ALC);
        return this;
    }

    public Produto NCM(String NCM) {
        setNCM(NCM);
        return this;
    }

    public Produto ID_TARJA(String ID_TARJA) {
        setID_TARJA(ID_TARJA);
        return this;
    }

    public Produto CLASSE_TERAPEUTICA(String CLASSE_TERAPEUTICA) {
        setCLASSE_TERAPEUTICA(CLASSE_TERAPEUTICA);
        return this;
    }

    public Produto PORTARIA_344_98(String PORTARIA_344_98) {
        setPORTARIA_344_98(PORTARIA_344_98);
        return this;
    }

    public Produto PRODUTO_REFERENCIA(String PRODUTO_REFERENCIA) {
        setPRODUTO_REFERENCIA(PRODUTO_REFERENCIA);
        return this;
    }

    public Produto CAS(String CAS) {
        setCAS(CAS);
        return this;
    }

    public Produto DCB(String DCB) {
        setDCB(DCB);
        return this;
    }

    public Produto ATC_CODE(String ATC_CODE) {
        setATC_CODE(ATC_CODE);
        return this;
    }

    public Produto CAP(String CAP) {
        setCAP(CAP);
        return this;
    }

    public Produto CONFAZ_87(String CONFAZ_87) {
        setCONFAZ_87(CONFAZ_87);
        return this;
    }

    public Produto TISS_TUSS(String TISS_TUSS) {
        setTISS_TUSS(TISS_TUSS);
        return this;
    }

    public Produto CEST(String CEST) {
        setCEST(CEST);
        return this;
    }

    public Produto ID_FABRICANTE(String ID_FABRICANTE) {
        setID_FABRICANTE(ID_FABRICANTE);
        return this;
    }

    public Produto NOME_FABRICANTE(String NOME_FABRICANTE) {
        setNOME_FABRICANTE(NOME_FABRICANTE);
        return this;
    }

    public Produto ID_LCCT(String ID_LCCT) {
        setID_LCCT(ID_LCCT);
        return this;
    }

    public Produto DESCRICAO_LISTA(String DESCRICAO_LISTA) {
        setDESCRICAO_LISTA(DESCRICAO_LISTA);
        return this;
    }

    public Produto ID_REGIME_PRECO(String ID_REGIME_PRECO) {
        setID_REGIME_PRECO(ID_REGIME_PRECO);
        return this;
    }

    public Produto DESCRICAO_REGIME_PRECO(String DESCRICAO_REGIME_PRECO) {
        setDESCRICAO_REGIME_PRECO(DESCRICAO_REGIME_PRECO);
        return this;
    }

    public Produto ID_TIPO_PRODUTO(String ID_TIPO_PRODUTO) {
        setID_TIPO_PRODUTO(ID_TIPO_PRODUTO);
        return this;
    }

    public Produto DESCRICAO_TIPO_PRODUTO(String DESCRICAO_TIPO_PRODUTO) {
        setDESCRICAO_TIPO_PRODUTO(DESCRICAO_TIPO_PRODUTO);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(ID_PRODUTO, produto.ID_PRODUTO) && Objects.equals(EAN, produto.EAN)
                && Objects.equals(REGISTRO_ANVISA, produto.REGISTRO_ANVISA) && Objects.equals(GGREM, produto.GGREM)
                && Objects.equals(NOME, produto.NOME) && Objects.equals(DESCRICAO, produto.DESCRICAO)
                && Objects.equals(COMPOSICAO, produto.COMPOSICAO)
                && Objects.equals(QTD_EMBALAGEM, produto.QTD_EMBALAGEM) && Objects.equals(PF_20, produto.PF_20)
                && Objects.equals(PMC_20, produto.PMC_20) && Objects.equals(PF_18, produto.PF_18)
                && Objects.equals(PMC_18, produto.PMC_18) && Objects.equals(PF_17, produto.PF_17)
                && Objects.equals(PMC_17, produto.PMC_17) && Objects.equals(PF_17_5, produto.PF_17_5)
                && Objects.equals(PMC_17_5, produto.PMC_17_5) && Objects.equals(PF_12, produto.PF_12)
                && Objects.equals(PMC_12, produto.PMC_12) && Objects.equals(PF_0, produto.PF_0)
                && Objects.equals(PMC_0, produto.PMC_0) && Objects.equals(PERCENTUAL_IPI, produto.PERCENTUAL_IPI)
                && Objects.equals(DATA_VIGENCIA, produto.DATA_VIGENCIA) && Objects.equals(NOVO, produto.NOVO)
                && Objects.equals(VARIACAO_PRECO, produto.VARIACAO_PRECO)
                && Objects.equals(PF_17_ALC, produto.PF_17_ALC) && Objects.equals(PMC_17_ALC, produto.PMC_17_ALC)
                && Objects.equals(PF_17_5_ALC, produto.PF_17_5_ALC)
                && Objects.equals(PMC_17_5_ALC, produto.PMC_17_5_ALC) && Objects.equals(PF_18_ALC, produto.PF_18_ALC)
                && Objects.equals(PMC_18_ALC, produto.PMC_18_ALC) && Objects.equals(NCM, produto.NCM)
                && Objects.equals(ID_TARJA, produto.ID_TARJA)
                && Objects.equals(CLASSE_TERAPEUTICA, produto.CLASSE_TERAPEUTICA)
                && Objects.equals(PORTARIA_344_98, produto.PORTARIA_344_98)
                && Objects.equals(PRODUTO_REFERENCIA, produto.PRODUTO_REFERENCIA) && Objects.equals(CAS, produto.CAS)
                && Objects.equals(DCB, produto.DCB) && Objects.equals(ATC_CODE, produto.ATC_CODE)
                && Objects.equals(CAP, produto.CAP) && Objects.equals(CONFAZ_87, produto.CONFAZ_87)
                && Objects.equals(TISS_TUSS, produto.TISS_TUSS) && Objects.equals(CEST, produto.CEST)
                && Objects.equals(ID_FABRICANTE, produto.ID_FABRICANTE)
                && Objects.equals(NOME_FABRICANTE, produto.NOME_FABRICANTE) && Objects.equals(ID_LCCT, produto.ID_LCCT)
                && Objects.equals(DESCRICAO_LISTA, produto.DESCRICAO_LISTA)
                && Objects.equals(ID_REGIME_PRECO, produto.ID_REGIME_PRECO)
                && Objects.equals(DESCRICAO_REGIME_PRECO, produto.DESCRICAO_REGIME_PRECO)
                && Objects.equals(ID_TIPO_PRODUTO, produto.ID_TIPO_PRODUTO)
                && Objects.equals(DESCRICAO_TIPO_PRODUTO, produto.DESCRICAO_TIPO_PRODUTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_PRODUTO, EAN, REGISTRO_ANVISA, GGREM, NOME, DESCRICAO, COMPOSICAO, QTD_EMBALAGEM, PF_20,
                PMC_20, PF_18, PMC_18, PF_17, PMC_17, PF_17_5, PMC_17_5, PF_12, PMC_12, PF_0, PMC_0, PERCENTUAL_IPI,
                DATA_VIGENCIA, NOVO, VARIACAO_PRECO, PF_17_ALC, PMC_17_ALC, PF_17_5_ALC, PMC_17_5_ALC, PF_18_ALC,
                PMC_18_ALC, NCM, ID_TARJA, CLASSE_TERAPEUTICA, PORTARIA_344_98, PRODUTO_REFERENCIA, CAS, DCB, ATC_CODE,
                CAP, CONFAZ_87, TISS_TUSS, CEST, ID_FABRICANTE, NOME_FABRICANTE, ID_LCCT, DESCRICAO_LISTA,
                ID_REGIME_PRECO, DESCRICAO_REGIME_PRECO, ID_TIPO_PRODUTO, DESCRICAO_TIPO_PRODUTO);
    }

    @Override
    public String toString() {
        return "{" + " ID_PRODUTO :'" + getID_PRODUTO() + "'" + ", EAN :'" + getEAN() + "'" + ", REGISTRO_ANVISA :'"
                + getREGISTRO_ANVISA() + "'" + ", GGREM :'" + getGGREM() + "'" + ", NOME :'" + getNOME() + "'"
                + ", DESCRICAO :'" + getDESCRICAO() + "'" + ", COMPOSICAO :'" + getCOMPOSICAO() + "'"
                + ", QTD_EMBALAGEM :'" + getQTD_EMBALAGEM() + "'" + ", PF_20 :'" + getPF_20() + "'" + ", PMC_20 :'"
                + getPMC_20() + "'" + ", PF_18 :'" + getPF_18() + "'" + ", PMC_18 :'" + getPMC_18() + "'" + ", PF_17 :'"
                + getPF_17() + "'" + ", PMC_17 :'" + getPMC_17() + "'" + ", PF_17_5 :'" + getPF_17_5() + "'"
                + ", PMC_17_5 :'" + getPMC_17_5() + "'" + ", PF_12 :'" + getPF_12() + "'" + ", PMC_12 :'" + getPMC_12()
                + "'" + ", PF_0 :'" + getPF_0() + "'" + ", PMC_0 :'" + getPMC_0() + "'" + ", PERCENTUAL_IPI :'"
                + getPERCENTUAL_IPI() + "'" + ", DATA_VIGENCIA :'" + getDATA_VIGENCIA() + "'" + ", NOVO :'" + getNOVO()
                + "'" + ", VARIACAO_PRECO :'" + getVARIACAO_PRECO() + "'" + ", PF_17_ALC :'" + getPF_17_ALC() + "'"
                + ", PMC_17_ALC :'" + getPMC_17_ALC() + "'" + ", PF_17_5_ALC :'" + getPF_17_5_ALC() + "'"
                + ", PMC_17_5_ALC :'" + getPMC_17_5_ALC() + "'" + ", PF_18_ALC :'" + getPF_18_ALC() + "'"
                + ", PMC_18_ALC :'" + getPMC_18_ALC() + "'" + ", NCM :'" + getNCM() + "'" + ", ID_TARJA :'"
                + getID_TARJA() + "'" + ", CLASSE_TERAPEUTICA :'" + getCLASSE_TERAPEUTICA() + "'"
                + ", PORTARIA_344_98 :'" + getPORTARIA_344_98() + "'" + ", PRODUTO_REFERENCIA :'"
                + getPRODUTO_REFERENCIA() + "'" + ", CAS :'" + getCAS() + "'" + ", DCB :'" + getDCB() + "'"
                + ", ATC_CODE :'" + getATC_CODE() + "'" + ", CAP :'" + getCAP() + "'" + ", CONFAZ_87 :'"
                + getCONFAZ_87() + "'" + ", TISS_TUSS :'" + getTISS_TUSS() + "'" + ", CEST :'" + getCEST() + "'"
                + ", ID_FABRICANTE :'" + getID_FABRICANTE() + "'" + ", NOME_FABRICANTE :'" + getNOME_FABRICANTE() + "'"
                + ", ID_LCCT :'" + getID_LCCT() + "'" + ", DESCRICAO_LISTA :'" + getDESCRICAO_LISTA() + "'"
                + ", ID_REGIME_PRECO :'" + getID_REGIME_PRECO() + "'" + ", DESCRICAO_REGIME_PRECO :'"
                + getDESCRICAO_REGIME_PRECO() + "'" + ", ID_TIPO_PRODUTO :'" + getID_TIPO_PRODUTO() + "'"
                + ", DESCRICAO_TIPO_PRODUTO :'" + getDESCRICAO_TIPO_PRODUTO() + "'" + "}";
    }
}
