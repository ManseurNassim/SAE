
##import mysql.connector
##
##mydb = mysql.connector.connect(
##   host="localhost",
##   user="root",
##   password="" )
##
##mycursor = mydb.cursor()
##mycursor.execute("SHOW DATABASES")
##for x in mycursor:
##        print(x)
##        ('information_schema',)
##        ('arduinobdd',)
##        ('classicmodels',)
##        ('films_v2.0',)
##        ('itis',)
##        ('mysql',)
##        ('mysqlsampledatabase',)
##        ('performance_schema',)
##        ('restaurant',)
##        ('sys',)
##        ('testprenom',)
##        ('villes_france',)

##import mysql.connector
##
##mydb = mysql.connector.connect(
##   host="localhost",
##   user="root",
##   password="",
##   database="films_v2.0" )

##import mysql.connector
##
##mydb = mysql.connector.connect(
##   host="localhost",
##   user="root",
##   password="",
##   database="films_v2.0")
##mycursor = mydb.cursor()
##mycursor.execute("SELECT titre from film where année > 2018")
##myresult = mycursor.fetchall()
##for i in range(len(myresult)):
##     print (myresult[i]) # type tuple
##     l=list(myresult[i]) # type liste
##     print(l)
##     print(l[0])  # type str
