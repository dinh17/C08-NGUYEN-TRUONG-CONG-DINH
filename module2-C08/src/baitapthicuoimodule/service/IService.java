package baitapthicuoimodule.service;

import java.io.IOException;

public interface IService {
    void addStudent() throws IOException;
    void displayStudent() throws IOException;
    void removeStudent();
    void  editStudent();
}
