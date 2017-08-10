package com.example.aff02.fragmentlifecycle;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create Reference to the fragment manager
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //with this we perform all the interactions with the fragment
        fragmentManager = getFragmentManager();
    }

    public void addA(View v)
    {
        //Create Object of the fragment
        FragA fragA = new FragA();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        //use method with three arguments
        //instead of String A we can also use the findFragmentByTag();
        transaction.add(R.id.group,fragA,"A");
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void addB(View v)
    {
        FragB fragB = new FragB();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.group,fragB,"B");

        //to commit the transaction is most important
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeA(View v)
    {

        //here find the fragment with the help of the tag
        FragA fragA = (FragA) fragmentManager.findFragmentByTag("A");
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (fragA != null)
        {
            transaction.remove(fragA);
            transaction.addToBackStack("removeA");
            transaction.commit();
        }
        else
        {
            Toast.makeText(this,"This Fragment was not added before",Toast.LENGTH_LONG).show();
        }

    }
    public void removeB(View v)
    {
        FragB fragB = (FragB) fragmentManager.findFragmentByTag("B");
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (fragB != null)
        {
            transaction.remove(fragB);
            transaction.addToBackStack("removeB");
            transaction.commit();
        }

        else
        {
            Toast.makeText(this,"This Fragment was not added before",Toast.LENGTH_LONG).show();
        }

    }

    public void replaceAwB(View v)
    {
        FragB fragB = new FragB();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.group,fragB,"B");
        transaction.addToBackStack("replaceAwB");
        transaction.commit();
    }
    public void replaceBwA(View v)
    {
        FragA fragA = new FragA();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.group,fragA,"A");
        transaction.addToBackStack("replaceBwA");
        transaction.commit();
    }


    /*in this method the object is not destroyed completely
     * only onAttach,onCreate,onCreateView,onActivityCreated methods are called while creation */
    public void attachA(View v)
    {
        FragA fragA = (FragA)fragmentManager.findFragmentByTag("A");
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (fragA != null)
        {
            transaction.attach(fragA);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }

    }

    /*here in this method only onPause ,onStop, onDestroyView are executed*/

    /*onAttach and onDetach are only called when the Fragment is associated or de-associated
    * with the activity..*/
    public void detachA(View v)
    {
        FragA fragA = (FragA)fragmentManager.findFragmentByTag("A");
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (fragA != null)
        {
            transaction.detach(fragA);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }

    }
}
