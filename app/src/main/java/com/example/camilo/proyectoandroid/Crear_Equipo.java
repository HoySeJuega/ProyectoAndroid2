package com.example.camilo.proyectoandroid;

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsoluteLayout;
import android.widget.ArrayAdapter;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Crear_Equipo extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private static final int PICK_CONTACT = 1;
    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear__equipo);


        ImageButton btn6 = (ImageButton) findViewById(R.id.iB6);
        btn6.setBackground(null);
        ImageButton btn7 = (ImageButton) findViewById(R.id.iB7);
        btn7.setBackground(null);
        ImageButton btn8 = (ImageButton) findViewById(R.id.iB8);
        btn8.setBackground(null);
        ImageButton btn9 = (ImageButton) findViewById(R.id.iB9);
        btn9.setBackground(null);
        ImageButton btn10 = (ImageButton) findViewById(R.id.iB10);
        btn10.setBackground(null);
        ImageButton btn11 = (ImageButton) findViewById(R.id.iB11);
        btn11.setBackground(null);




        ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#558B2F"));
        getActionBar().setBackgroundDrawable(colorDrawable);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.azul2));


    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()

                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();

    }




    public void Contactos(View View) {
        PackageManager pm=getPackageManager();
        try {

            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "";

            PackageInfo info=pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));

        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }




}

    public void Ocultar(View View){
        ImageButton btn = (ImageButton)findViewById(R.id.iB6);
        btn.setBackground(null);
    }




    public void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);
    }







    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);



                ImageButton btn4 = (ImageButton) findViewById(R.id.iB4);
                btn4.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn4.setX(138);

                ImageButton btn5 = (ImageButton) findViewById(R.id.iB5);
                btn5.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn5.setX(430);

                ImageButton btn6 = (ImageButton) findViewById(R.id.iB6);
                btn6.setBackground(null);
                ImageButton btn7 = (ImageButton) findViewById(R.id.iB7);
                btn7.setBackground(null);
                ImageButton btn8 = (ImageButton) findViewById(R.id.iB8);
                btn8.setBackground(null);
                ImageButton btn9 = (ImageButton) findViewById(R.id.iB9);
                btn9.setBackground(null);
                ImageButton btn10 = (ImageButton) findViewById(R.id.iB10);
                btn10.setBackground(null);
                ImageButton btn11 = (ImageButton) findViewById(R.id.iB11);
                btn11.setBackground(null);

                break;
            case 2:
                mTitle = getString(R.string.title_section2);

                btn4 = (ImageButton) findViewById(R.id.iB4);
                btn4.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn4.setX(120);

                btn5 = (ImageButton) findViewById(R.id.iB5);
                btn5.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn5.setX(450);

                btn7 = (ImageButton) findViewById(R.id.iB7);
                btn7.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn7.setX(280);
                btn7.setY(300);
                btn6 = (ImageButton) findViewById(R.id.iB6);
                btn6.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn6.setX(280);
                btn6.setY(650);
                btn8 = (ImageButton) findViewById(R.id.iB8);
                btn8.setBackground(null);
                btn9 = (ImageButton) findViewById(R.id.iB9);
                btn9.setBackground(null);
                btn11 = (ImageButton) findViewById(R.id.iB11);
                btn11.setBackground(null);
                btn10 = (ImageButton) findViewById(R.id.iB10);
                btn10.setBackground(null);







                break;
            case 3:
                mTitle = getString(R.string.title_section3);


                btn4 = (ImageButton) findViewById(R.id.iB4);

                btn4.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn5 = (ImageButton) findViewById(R.id.iB5);
                btn5.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn4.setX(35);
                btn5.setX(500);
                btn6 = (ImageButton) findViewById(R.id.iB7);
                btn6.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn6.setX(280);
                btn6.setY(430);
                btn7 = (ImageButton) findViewById(R.id.iB6);
                btn7.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn7.setX(280);
                btn7.setY(650);
                btn8 = (ImageButton) findViewById(R.id.iB8);
                btn8.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn8.setX(400);
                btn8.setY(200);
                btn9 = (ImageButton) findViewById(R.id.iB9);
                btn9.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn9.setX(150);
                btn9.setY(200);
                btn11 = (ImageButton) findViewById(R.id.iB11);
                btn11.setBackground(null);
                btn10 = (ImageButton) findViewById(R.id.iB10);
                btn10.setBackground(null);

                break;
            case 4:
                mTitle = getString(R.string.title_section4);

                btn7 = (ImageButton) findViewById(R.id.iB7);
                btn7.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn6 = (ImageButton) findViewById(R.id.iB6);
                btn6.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn8 = (ImageButton) findViewById(R.id.iB8);
                btn8.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn9 = (ImageButton) findViewById(R.id.iB9);
                btn9.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn11 = (ImageButton) findViewById(R.id.iB11);
                btn11.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));
                btn10 = (ImageButton) findViewById(R.id.iB10);
                btn10.setBackgroundDrawable(getResources().getDrawable(R.drawable.boton));



                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.crear__equipo, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_crear__equipo, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((Crear_Equipo) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
