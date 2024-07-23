package FinalJunio.codigo.DTO;

public class VentaDto {

    private String ventaID;
    private FuncionDTO funcionDTO;

    public VentaDto(String ventaID, FuncionDTO funcionDTO) {
        this.ventaID = ventaID;
        this.funcionDTO = funcionDTO;
    }

    public String getVentaID() {
        return ventaID;
    }

    public void setVentaID(String ventaID) {
        this.ventaID = ventaID;
    }

    public FuncionDTO getFuncionDTO() {
        return funcionDTO;
    }

    public void setFuncionDTO(FuncionDTO funcionDTO) {
        this.funcionDTO = funcionDTO;
    }


    @Override
    public String toString() {
        return "VentaDto{" +
                "ventaID='" + ventaID + '\'' +
                ", funcionDTO=" + funcionDTO +
                '}';
    }
}
