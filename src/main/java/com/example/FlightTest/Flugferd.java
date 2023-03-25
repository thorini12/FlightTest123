package com.example.FlightTest;

public class Flugferd
{
	private long flugnumer;
	private String brottfararstadur;
	private long brottfarartimi;
	private String komustadur;
	private long komutimi;
	private long flugtimi;
	private String flugvelategund;
	private String flugfelag;
	private long saetaverd;
	private long lausSaeti;

	public Flugferd(long flugnumer, String brottfararstadur, long brottfarartimi, String komustadur, long komutimi, long flugtimi, String flugvelategund, String flugfelag, long saetaverd, long lausSaeti) {
		this.flugnumer = flugnumer;
		this.brottfararstadur = brottfararstadur;
		this.brottfarartimi = brottfarartimi;
		this.komustadur = komustadur;
		this.komutimi = komutimi;
		this.flugtimi = flugtimi;
		this.flugvelategund = flugvelategund;
		this.flugfelag = flugfelag;
		this.saetaverd = saetaverd;
		this.lausSaeti = lausSaeti;
	}

	public Flugferd() {
	}

	public Flugferd(long flugnumer, String brottfararstadur, String komustadur, long saetaverd) {
		this.flugnumer = flugnumer;
		this.brottfararstadur = brottfararstadur;
		this.komustadur = komustadur;
		this.saetaverd = saetaverd;
	}

	public long getFlugnumer() {
		return flugnumer;
	}

	public void setFlugnumer(long flugnumer) {
		this.flugnumer = flugnumer;
	}

	public String getBrottfararstadur() {
		return brottfararstadur;
	}

	public void setBrottfararstadur(String brottfararstadur) {
		this.brottfararstadur = brottfararstadur;
	}

	public long getBrottfarartimi() {
		return brottfarartimi;
	}

	public void setBrottfarartimi(long brottfarartimi) {
		this.brottfarartimi = brottfarartimi;
	}

	public String getKomustadur() {
		return komustadur;
	}

	public void setKomustadur(String komustadur) {
		this.komustadur = komustadur;
	}

	public long getKomutimi() {
		return komutimi;
	}

	public void setKomutimi(long komutimi) {
		this.komutimi = komutimi;
	}

	public long getFlugtimi() {
		return flugtimi;
	}

	public void setFlugtimi(long flugtimi) {
		this.flugtimi = flugtimi;
	}

	public String getFlugvelategund() {
		return flugvelategund;
	}

	public void setFlugvelategund(String flugvelategund) {
		this.flugvelategund = flugvelategund;
	}

	public String getFlugfelag() {
		return flugfelag;
	}

	public void setFlugfelag(String flugfelag) {
		this.flugfelag = flugfelag;
	}

	public long getSaetaverd() {
		return saetaverd;
	}

	public void setSaetaverd(long saetaverd) {
		this.saetaverd = saetaverd;
	}

	public long getLausSaeti() {
		return lausSaeti;
	}

	public void setLausSaeti(long lausSaeti) {
		this.lausSaeti = lausSaeti;
	}

	public static void main(String[] args)
	{
		System.out.println("This class, Flugferd, is not for running. Documentation follows.");
		System.out.println("public Flugferd(long fn, String bfs, long bft, String ks, long kt, String fvt, long sv) throws Exception");
		System.out.println("public long getFlightNumber()");
		System.out.println("public String getDepartureLocation()");
		System.out.println("public long getDepartureTimeUTS()");
		System.out.println("public String getArrivalLocation()");
		System.out.println("public long getArrivalTimeUTS()");
		System.out.println("public long getFlightTimeUTS()");
		System.out.println("public String getPlaneModel()");
		System.out.println("public String getFlugfelag()");
		System.out.println("public long getSeatPrice()");
		System.out.println("public long getFreeSeats()");
	}
}