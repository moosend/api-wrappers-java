package Moosend.API.Client;

import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;
//import java.lang.reflect.*;

public class Utilities
{
//	private static void CopyProperties(java.lang.Class type, Object source, Object target)
//	{        
//		try
//        {            
//            Utilities.class.getMethod("CopyProperties").invoke(null, new Object[] {source, target})
//            //Utilities.class.getMethod("CopyProperties", null).invoke(null, new Object[] {source, target});  
//        }
//        catch (NoSuchMethodException  ex){
//        System.out.println("Method either doesn't exist " +
//                "or is not public: " + ex.toString());
//        }
//        catch (IllegalAccessException ex)
//        {
//            System.out.println(ex.toString());
//        }
//        catch(Exception ex){
//            System.out.println(ex.toString());
//        }
//	}

	public static <T> void CopyProperties(T source, T target) throws IllegalAccessException, InvocationTargetException
	{   
        //Object oSource = (Object)source;
        //Object oTarget = (Object)target;
        try{
            BeanUtils.copyProperties(target, source);
        }
        catch(IllegalAccessException iex){
            throw iex;
        }
        catch(InvocationTargetException inv_ex){
            throw inv_ex;
        }
//		//for (PropertyInfo property : T.class. .GetProperties().Where(p => p.CanRead && p.CanWrite))        
//        for (Method method : target.getClass().getMethods())
//		{
//            PropertyInfo<String>
//            method.
//            if(field.)
//			if (property.PropertyType.IsValueType || property.PropertyType == String.class)
//			{
//				property.SetValue(target, property.GetValue(source, null), null);
//			}
//			else if (property.PropertyType.<Iterable>DerivesFrom())
//			{
//				Iterable list1 = (Iterable)property.GetValue(source, null);
//				Iterable list2 = (Iterable)property.GetValue(target, null);
//				if (list1 != null && list2 != null && list1.getClass() == list2.getClass())
//				{
//					java.util.Iterator enum1 = list1.iterator();
//					java.util.Iterator enum2 = list2.iterator();
//					while (true)
//					{
//						boolean moved1 = enum1.MoveNext();
//						boolean moved2 = enum2.MoveNext();
//						if (moved1 && moved2)
//						{
//							if (enum1.Current != null && enum2.Current != null)
//							{
//								CopyProperties(enum1.Current.getClass(), enum1.Current, enum2.Current);
//							}
//						}
//						else if (moved1 != moved2)
//						{
//							throw new UnsupportedOperationException(String.format("Failed to copy values for property %1$s\nReason: IEnumerable count mismatch", property.Name));
//						}
//						else
//						{
//							break;
//						}
//					}
//				}
//				else
//				{
//					throw new UnsupportedOperationException(String.format("Failed to copy values for property %1$s\nReason: null state or type mismatch", property.Name));
//				}
//			}
//			else
//			{
//				Object value1 = property.GetValue(source, null);
//				Object value2 = property.GetValue(target, null);
//				if (value1 != null || value2 != null)
//				{
//					if (value1 != null && value2 != null && value1.getClass() == value2.getClass())
//					{
//						CopyProperties(value1.getClass(), value1, value2);
//					}
//					else
//					{
//						throw new UnsupportedOperationException(String.format("Failed to copy values for property %1$s\nReason: null state or type mismatch", property.Name));
//					}
//				}
//			}
//      }
	}
}