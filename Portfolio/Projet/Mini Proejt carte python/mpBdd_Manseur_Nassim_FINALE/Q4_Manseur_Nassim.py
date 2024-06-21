 #QUESTION 4
import folium
import mysql.connector#Importation des 2 fonctions

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="",
  database="France_regions_depts")
mycursor = mydb.cursor()
#Permet de lié le programme python avec la basse de donnée
c=folium.Map(location=[ 49.26667, 2.46667],zoom_start=15)
#point de départ de la carte


def curseur(NombreVille,requete):
     cpt=0 #incrémentation du compteur a 0 qui compte le chiffre des villes de la plus grande a la plus petite
     mycursor.execute(requete)#Permet de faire la requête
     myresult = mycursor.fetchall()#Permet d'enregister la requête dans myresult
     for i in range(NombreVille): #boucle bornée qui tourne le nombre de fois qu'il y a de ville
       longitude=float(myresult[cpt][0])#Permet de prendre et de convertir chaque nombres en flotant pour la longitude
       latitude=float(myresult[cpt][1])#Permet de prendre et de convertir chaque nombrelotant pour la latitude
       nomville=str(myresult[cpt][2])#Permet de prendre et de convertir chaque nom de ville en string
       folium.Marker([longitude,latitude],popup=nomville).add_to(c)#Permet de crée le marqueur avec les bonne coordonnées de chaques villes et leur noms
       cpt=cpt+1#incrémentation du compteur
       print(i,longitude,latitude,nomville)#Permet de vérifier nos résultats dans nos variables
     return #retourn ok pour montrer que la fonction a bien été effectuer
#Fonction qui permet de marquer sur la carte les villes suivant une réquête donnée qu'on précise et le nombre de ville nécéssaires

print(curseur(20,"SELECT latitude,longitude,nom_ville FROM villes_200 ORDER BY villes_200.population DESC LIMIT 20"))
print(curseur(3,"SELECT latitude,longitude,nom_ville FROM villes_200 WHERE nom_ville='creil' OR nom_ville='nogent sur oise' OR nom_ville='montataire'"))
#Permet d'executer les requêtes dans la base de donner en appelant la fonction curseur

c.save("Q4_Nassim_Manseur.html")#on enregistre la carte dans le html




