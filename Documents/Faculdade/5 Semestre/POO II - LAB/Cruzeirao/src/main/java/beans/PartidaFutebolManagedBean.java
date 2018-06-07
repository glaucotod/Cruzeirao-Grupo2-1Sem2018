package beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import models.Partida;

@SessionScoped
@ManagedBean(eager=true, name = "partidaFutebolMB")
public class PartidaFutebolManagedBean{
     
    private TreeNode root;
    private ManageTable manager;
    
    public PartidaFutebolManagedBean() {
    	this.manager = new ManageTable();
    }
    
    @PostConstruct
    public void init() {
    	
    	TreeNode parent = null;
    	
        root = new DefaultTreeNode("Inicio", null);
        parent = root;
        boolean firstTime = true;
        TreeNode node;
        
        Map<Integer, List<Partida>> map = manager.getRodadas();
        
        Iterator<Entry<Integer, List<Partida>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        
            if(firstTime) {
            	parent = root;
            	firstTime = false;
            }

        	List<Partida> partidas = (List<Partida>) pair.getValue();
        	
        	for(Partida p : partidas) {
        		node = new DefaultTreeNode(p.getEquipeMandante().getEquipe().getNome() + " VS " + p.getEquipeVisitante().getEquipe().getNome(), parent);
        		parent = node;
        		Partida next = p.getProxPartida();
        		
        		while(next != null) {
        			node = new DefaultTreeNode(next.getEquipeMandante().getEquipe().getNome() + " VS " + next.getEquipeVisitante().getEquipe().getNome(), parent);
        			next = next.getProxPartida();
        		}
        	}
        	
        }
        
        
    }
        
        //TreeNode node0 = new DefaultTreeNode(p.getEquipeMandante().getEquipe().getNome() + " VS " + null, root);
         
      /*
        node1.getChildren().add(new DefaultTreeNode("Node 1.1"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
        node01.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
        node10.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
        root.getChildren().add(new DefaultTreeNode("Node 2"));
    	*/
 
    public TreeNode getRoot() {
        return root;
    }
	

}
