SELECT v.VisitDate, v.Reason, mr.Diagnosis, mr.Treatment, c.Name AS CatName, c.Breed,
       o.Name AS OwnerName, o.Phone
FROM Visits v
JOIN MedicalRecords mr ON v.VisitID = mr.VisitID
JOIN Cats c ON v.CatID = c.CatID
JOIN Owners o ON c.OwnerID = o.OwnerID
WHERE v.VisitDate > '2024-03-01'