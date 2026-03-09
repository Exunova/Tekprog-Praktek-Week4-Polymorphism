// Salesperson.java
public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    public int compareTo(Object other)
    {
        int result;
        Salesperson otherSP = (Salesperson) other;

        if (totalSales != otherSP.getSales())
            result = totalSales - otherSP.getSales();
        else
        {
            result = lastName.compareTo(otherSP.getLastName());
            if (result == 0)
                result = firstName.compareTo(otherSP.getFirstName());
        }
        return result;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getSales()
    {
        return totalSales;
    }
}
