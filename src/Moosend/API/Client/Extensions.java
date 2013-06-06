package Moosend.API.Client;

//import java.lang.*;
//import java.text.NumberFormat;

public final class Extensions
{
//ORIGINAL LINE: public static bool DerivesFrom<T>(this Type type)
	public static boolean DerivesFrom(Class ThisClass, Class DerivesFromClass)
	{
		return _DerivesFrom(ThisClass, DerivesFromClass);
	}

//C# TO JAVA: Extension methods are not available in Java
//ORIGINAL LINE: public static bool IsOrDerivesFrom<T>(this Type type)
	public static boolean IsOrDerivesFrom(Class ThisClass, Class DerivesFromClass)
	{
        //T tObject = new T();
		if (ThisClass == DerivesFromClass)
		{
			return true;
		}
		return _DerivesFrom(ThisClass, DerivesFromClass);
	}

//ORIGINAL LINE: private static bool DerivesFrom(this Type type, Type baseType)
	private static boolean _DerivesFrom(Class type, java.lang.Class baseType) throws NullPointerException
	{
		try{
            if (type == baseType)
            {
                return false;
            }
            if (type.isInterface() && !baseType.isInterface())
            {
                return false;
            }
            if (baseType == null)
            {
                return false;
            }
            if (baseType.isInterface())
            {            
                for(Class interf : type.getInterfaces()){
                    if(interf == baseType){
                        return true;
                    }
                }
                return false;
            }

            while (type != baseType)
            {
                if (type == Object.class)
                {
                    return false;
                }
                type = type.getSuperclass();
            }
            return true;
        }
        catch(NullPointerException nex){
            throw nex;
        }
	}


//ORIGINAL LINE: public static object GetDefault(this Type t)
	public static Object GetDefault(Class ThisClassType) throws InstantiationException, IllegalAccessException
	{ 
        try{
            return (!ThisClassType.getClass().isPrimitive()) ?  ThisClassType.getClass().newInstance() : null;
        }
        catch(InstantiationException iex){
            throw iex;
        }
        catch(IllegalAccessException ilex){
            throw ilex;
        }
	}


//ORIGINAL LINE: public static void CheckNotNull(this object value, string paramName)
	public static void CheckNotNull(Object value, String paramName) throws InstantiationException, IllegalAccessException
	{
		if (value == null || value.equals(GetDefault(value.getClass())))
		{
			throw new IllegalArgumentException(paramName);
		}
	}

    public static <F, T> T Convert(F fromObj, Class<T> toObj) {
        return (T) toObj;
    }

    public static <T> T Convert(Object o) {
        return (T) o;
    }
    
	/** 
	 Convert the given object to an object of type T. 
	*/
////ORIGINAL LINE: public static T Convert<T>(this object from)
//	public static <T> T Convert(Class<T> T_class, Object from)
//	{
//        //NumberFormat nf = NumberFormat.getNumberInstance();
//		return Moosend.API.Client.Extensions.<T>Convert(T_class, from, java.util.Locale.getDefault());
//	}

//	/** 
//	 Convert the given object to an object of type T. 
//	*/
//ORIGINAL LINE: public static T Convert<T>(this object from, CultureInfo info)
//	public static <T> T Convert(Class<T> T_class, Object from, java.util.Locale info) throws RuntimeException
//	{
//		if (from == null)
//		{
//			return null;
//		}
//        
//        //NumberFormat.getNumberInstance().parse();
//		try
//		{   
//            T t = (T)from;
//            T t2 = T_class.newInstance();
//            Class<T> enumClass = (Class<T>) t2.getClass();
//            
//			if (enumClass.isEnum())
//			{                 
//                //Class<enumClass> enumClass = (Class<enumClass>) t.getClass();                
//                Enum.valueOf(enumClass.getClass(), from.toString());
//				//return (T)Enum.valueOf(t.getClass(), from.toString());
//              //  eOf(from.getClass(), ""); //(T_class.getClass(), from.toString()); //(T.class, from.toString());
//			}
//			else if (T_class.getClass().IsGenericType && T_class.GetGenericTypeDefinition().equals(.class))
//			{
//				// UnderlyingType will equal System.DateTime
//				//NullableConverter nc = new NullableConverter(t);
//				return (T)System.Convert.ChangeType(from, nc.UnderlyingType, info);
//			}
//			else
//			{
//				return (T)System..Convert.ChangeType(from, t, info);
//			}
//            return null;
//		}		
//        catch (RuntimeException rex)
//		{
//			throw rex; //new RuntimeException(String.format("Cannot convert from %1$s to %2$s: %3$s", from.getClass().getName(), T.class.Name, ex.getMessage()));
//		}
//        catch(Exception ex){
//            throw ex;
//        }
//	}



//	public static String ToQueryString(Object request)
//	{
//		return ToQueryString(request, ",");
//	}


////ORIGINAL LINE: public static string ToQueryString(this object request, string separator = ",")
//	public static String ToQueryString(Object request, String separator)
//	{
//		if (request == null)
//		{
//			throw new IllegalArgumentException("request");
//		}
//        if(separator == null){
//           separator = ",";
//        }
//        [Ljava.lang.String;
//        new ObjectOutputStream(request);
//		// Get all properties on the object
//		java.util.HashMap<Object, Object> properties = request.getClass();
//        //request.getClass().GetProperties().Where(x => x.CanRead).Where(x => x.GetValue(request, null) != null).ToDictionary(x => x.Name, x => x.GetValue(request, null));
//
//		// Get names for all IEnumerable properties (excl. string)
//		java.util.ArrayList<Object> propertyNames = properties.Where(x => !(x.Value instanceof String) && x.Value instanceof Iterable).Select(x => x.Key).ToList();
//
//		// Concat all IEnumerable properties into a comma separated string
//
//		for (Object : propertyNames)
//		{
//			Class valueType = properties.get(key). .getClass();
//
//			var valueElemType = valueType.IsGenericType ? valueType.GetGenericArguments()[0] : valueType.GetElementType();
//			if (valueElemType.IsPrimitive || valueElemType == String.class)
//			{
//				Iterable enumerable = (Iterable)((properties.get(key) instanceof Iterable) ? properties.get(key) : null);
//				properties.put(key, tangible.DotNetToJavaStringHelper.join(separator, enumerable.<Object>Cast()));
//			}
//		}
//
//		// Concat all key/value pairs into a string separated by ampersand
//		return tangible.DotNetToJavaStringHelper.join("&", properties.Select(x => String.Concat(Uri.EscapeDataString(x.Key), "=", Uri.EscapeDataString(x.Value.toString()))));
//	}
}
