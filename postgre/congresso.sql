--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.12
-- Dumped by pg_dump version 11.1

-- Started on 2019-11-19 12:29:46 -03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 188 (class 1259 OID 148381)
-- Name: artigos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.artigos (
    id integer NOT NULL,
    titulo character varying(255) DEFAULT NULL::character varying,
    orientador character varying(255) DEFAULT NULL::character varying,
    coautores character varying(255) DEFAULT NULL::character varying,
    modalidade character varying(255) DEFAULT NULL::character varying,
    data_submissao character varying(20) DEFAULT NULL::character varying,
    id_participante bigint,
    url_download character varying(150) DEFAULT NULL::character varying
);


ALTER TABLE public.artigos OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 148379)
-- Name: artigos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.artigos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.artigos_id_seq OWNER TO postgres;

--
-- TOC entry 2196 (class 0 OID 0)
-- Dependencies: 187
-- Name: artigos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.artigos_id_seq OWNED BY public.artigos.id;


--
-- TOC entry 190 (class 1259 OID 148403)
-- Name: inscricaoefetuada; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.inscricaoefetuada (
    id integer NOT NULL,
    transacao character varying(255) NOT NULL,
    status character varying(255) NOT NULL,
    quantidade integer NOT NULL,
    valor double precision NOT NULL,
    formapagamento character varying(255) NOT NULL
);


ALTER TABLE public.inscricaoefetuada OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 148401)
-- Name: inscricaoefetuada_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.inscricaoefetuada_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.inscricaoefetuada_id_seq OWNER TO postgres;

--
-- TOC entry 2197 (class 0 OID 0)
-- Dependencies: 189
-- Name: inscricaoefetuada_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.inscricaoefetuada_id_seq OWNED BY public.inscricaoefetuada.id;


--
-- TOC entry 192 (class 1259 OID 148414)
-- Name: inscricoes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.inscricoes (
    id integer NOT NULL,
    data_inscricao timestamp without time zone,
    status_inscricao character varying(100) DEFAULT NULL::character varying,
    id_participante bigint,
    id_transacao character varying(255) DEFAULT NULL::character varying,
    preco double precision,
    tipodoevento character varying(50) DEFAULT NULL::character varying,
    tipodeparticipacao character varying(50) DEFAULT NULL::character varying
);


ALTER TABLE public.inscricoes OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 148412)
-- Name: inscricoes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.inscricoes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.inscricoes_id_seq OWNER TO postgres;

--
-- TOC entry 2198 (class 0 OID 0)
-- Dependencies: 191
-- Name: inscricoes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.inscricoes_id_seq OWNED BY public.inscricoes.id;


--
-- TOC entry 186 (class 1259 OID 148354)
-- Name: participantes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.participantes (
    id integer NOT NULL,
    nome character varying(255) DEFAULT ''::character varying,
    email character varying(100) DEFAULT ''::character varying,
    nome_cracha character varying(100) DEFAULT ''::character varying,
    instituicao character varying(255) DEFAULT ''::character varying,
    cpf character varying(100) DEFAULT ''::character varying,
    telefone_residencial character varying(15) DEFAULT ''::character varying,
    telefone_comercial character varying(15) DEFAULT ''::character varying,
    telefone_celular character varying(15) DEFAULT ''::character varying,
    estado character varying(100) DEFAULT ''::character varying,
    cidade character varying(255) DEFAULT ''::character varying,
    bairro character varying(255) DEFAULT ''::character varying,
    logradouro character varying(255) DEFAULT ''::character varying,
    numero character varying(100) DEFAULT ''::character varying,
    cep character varying(12) DEFAULT ''::character varying,
    tipo_usuario character varying(100) DEFAULT ''::character varying,
    profissao character varying(150) DEFAULT NULL::character varying
);


ALTER TABLE public.participantes OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 148352)
-- Name: participantes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.participantes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.participantes_id_seq OWNER TO postgres;

--
-- TOC entry 2199 (class 0 OID 0)
-- Dependencies: 185
-- Name: participantes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.participantes_id_seq OWNED BY public.participantes.id;


--
-- TOC entry 2043 (class 2604 OID 148384)
-- Name: artigos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.artigos ALTER COLUMN id SET DEFAULT nextval('public.artigos_id_seq'::regclass);


--
-- TOC entry 2050 (class 2604 OID 148406)
-- Name: inscricaoefetuada id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.inscricaoefetuada ALTER COLUMN id SET DEFAULT nextval('public.inscricaoefetuada_id_seq'::regclass);


--
-- TOC entry 2051 (class 2604 OID 148417)
-- Name: inscricoes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.inscricoes ALTER COLUMN id SET DEFAULT nextval('public.inscricoes_id_seq'::regclass);


--
-- TOC entry 2026 (class 2604 OID 148357)
-- Name: participantes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.participantes ALTER COLUMN id SET DEFAULT nextval('public.participantes_id_seq'::regclass);


--
-- TOC entry 2186 (class 0 OID 148381)
-- Dependencies: 188
-- Data for Name: artigos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.artigos (id, titulo, orientador, coautores, modalidade, data_submissao, id_participante, url_download) FROM stdin;
\.


--
-- TOC entry 2188 (class 0 OID 148403)
-- Dependencies: 190
-- Data for Name: inscricaoefetuada; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.inscricaoefetuada (id, transacao, status, quantidade, valor, formapagamento) FROM stdin;
2			1	1	
213123			1	1	
949494			1	1	
8976543			1	1	
0			1	1	
123			1	1	
12356789			1	1	
1234567890			1	1	
\.


--
-- TOC entry 2190 (class 0 OID 148414)
-- Dependencies: 192
-- Data for Name: inscricoes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.inscricoes (id, data_inscricao, status_inscricao, id_participante, id_transacao, preco, tipodoevento, tipodeparticipacao) FROM stdin;
\.


--
-- TOC entry 2184 (class 0 OID 148354)
-- Dependencies: 186
-- Data for Name: participantes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.participantes (id, nome, email, nome_cracha, instituicao, cpf, telefone_residencial, telefone_comercial, telefone_celular, estado, cidade, bairro, logradouro, numero, cep, tipo_usuario, profissao) FROM stdin;
85	teste	teste	teste	UDCG	698.531.257-81	(88)8888-8888	(88)8888-8888	(88)8888-8888	PB	Cajazeiras	Centro	Est. Estef. Ehrich	93	58900-000	ALUNO	\N
86	teste	teste@gmail.com	teste	UDCG	698.531.257-81	(88)8888-8888	(88)8888-8888	(88)8888-8888	PB	Cajazeiras	Centro	Est. Estef. Ehrich	93	58900-000	ALUNO	\N
87	teste teste	teste@hotmail.com	teste	UDCG	698.531.257-81	(88)8888-8888	(88)8888-8888	(88)8888-8888	AM	Cajazeiras	Centro	Primeiro de maio	123	58900-000	ALUNO	\N
\.


--
-- TOC entry 2200 (class 0 OID 0)
-- Dependencies: 187
-- Name: artigos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.artigos_id_seq', 1, false);


--
-- TOC entry 2201 (class 0 OID 0)
-- Dependencies: 189
-- Name: inscricaoefetuada_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.inscricaoefetuada_id_seq', 1, false);


--
-- TOC entry 2202 (class 0 OID 0)
-- Dependencies: 191
-- Name: inscricoes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.inscricoes_id_seq', 1, false);


--
-- TOC entry 2203 (class 0 OID 0)
-- Dependencies: 185
-- Name: participantes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.participantes_id_seq', 1, false);


--
-- TOC entry 2059 (class 2606 OID 148395)
-- Name: artigos artigos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.artigos
    ADD CONSTRAINT artigos_pkey PRIMARY KEY (id);


--
-- TOC entry 2061 (class 2606 OID 148411)
-- Name: inscricaoefetuada inscricaoefetuada_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.inscricaoefetuada
    ADD CONSTRAINT inscricaoefetuada_pkey PRIMARY KEY (id);


--
-- TOC entry 2063 (class 2606 OID 148423)
-- Name: inscricoes inscricoes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.inscricoes
    ADD CONSTRAINT inscricoes_pkey PRIMARY KEY (id);


--
-- TOC entry 2057 (class 2606 OID 148378)
-- Name: participantes participantes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.participantes
    ADD CONSTRAINT participantes_pkey PRIMARY KEY (id);


--
-- TOC entry 2064 (class 2606 OID 148396)
-- Name: artigos artigos_id_participante_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.artigos
    ADD CONSTRAINT artigos_id_participante_fkey FOREIGN KEY (id_participante) REFERENCES public.participantes(id);


--
-- TOC entry 2065 (class 2606 OID 148424)
-- Name: inscricoes inscricoes_id_participante_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.inscricoes
    ADD CONSTRAINT inscricoes_id_participante_fkey FOREIGN KEY (id_participante) REFERENCES public.participantes(id);


-- Completed on 2019-11-19 12:30:07 -03

--
-- PostgreSQL database dump complete
--

