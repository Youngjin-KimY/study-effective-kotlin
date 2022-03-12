package `item7-2`

// sealed class or interface can not be inherit from sealed class or interface of different package.
sealed class Error() :
    //item7.Error - cannot
{
}