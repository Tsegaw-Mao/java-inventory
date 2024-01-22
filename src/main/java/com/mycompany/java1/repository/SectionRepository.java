/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java1.repository;

import com.mycompany.java1.models.Section;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class SectionRepository {

    public static List<Section> Sections = new ArrayList<>();

    public SectionRepository(List<Section> sectionss) {
        this.Sections = sectionss;
    }

    public SectionRepository() {
        
    }

    public void addSection(Section section) {
        Sections.add(section);
    }

    public Section getSectionById(int sectionID) {
        for (Section section : Sections) {
            if (sectionID == section.getSectionID()) {
                return section;
            }
        }
        return null;
    }

    public void updateSection(Section updatedSection) {
        for (int i = 0; i < Sections.size(); i++) {
            if (updatedSection.getSectionID() == Sections.get(i).getSectionID()) {
                Sections.set(i, updatedSection);
                break;
            }
        }
    }

    public List<Section> getAllSections() {
        return Sections;
    }

    public void deleteSectionById(int sectionID) {
        for (int i = 0; i < Sections.size(); i++) {
            if (sectionID == Sections.get(i).getSectionID()) {
                Sections.remove(i);
                break;
            }
        }

    }
}
