package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
   private Set<Task> annsTasks;
   private Set<Task> bobsTasks;
   private Set<Task> carolsTasks;
   private Set<Task> unassignedTasks;

   public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
       this.annsTasks = annsTasks;
       this.bobsTasks = bobsTasks;
       this.carolsTasks = carolsTasks;
       this.unassignedTasks = unassignedTasks;
   }

   public Set<Task> getTasks(String name) {
       switch (name.toLowerCase()) {
           case "ann":
               return annsTasks;
           case "bob":
               return bobsTasks;
           case "carol":
               return carolsTasks;
           case "all":
               Set<Task> allTasks = new HashSet<>();
               allTasks.addAll(annsTasks);
               allTasks.addAll(bobsTasks);
               allTasks.addAll(carolsTasks);
               allTasks.addAll(unassignedTasks);
               return allTasks;
           default:
               return new HashSet<>();

       }
   }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        Set<Task> unionTasks = new HashSet<>(set1);
        unionTasks.addAll(set2);
        return unionTasks;
    }


    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersectionTasks = new HashSet<>(set1);
        intersectionTasks.retainAll(set2);
        return intersectionTasks;
    }


    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
       Set<Task> differedTasks = new HashSet<>(set1);
       differedTasks.removeAll(set2);
       return differedTasks;

    }

}
