@RestController
@RequestMapping("/pontos-turisticos")
public class PontoTuristicoController {
    @Autowired
    private PontoTuristicoService pontoTuristicoService;

    @PostMapping
    public PontoTuristico salvar(@RequestBody PontoTuristico pontoTuristico) {
        return pontoTuristicoService.salvar(pontoTuristico);
    }
}