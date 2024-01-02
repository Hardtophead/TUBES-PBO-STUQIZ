/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tabelModelJawaban extends AbstractTableModel{
    List<Jawaban> list_jawaban;

    public tabelModelJawaban(List<Jawaban> list_jawaban) {
        this.list_jawaban = list_jawaban;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return list_jawaban.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nim";
            case 1:
                return "Pertanyaan";
            case 2:
                return "Jawaban";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list_jawaban.get(row).getNim();
            case 1:
                return list_jawaban.get(row).getSoal();
            case 2:
                return list_jawaban.get(row).getJawaban();
            default:
                return null;
        }
    }
}
