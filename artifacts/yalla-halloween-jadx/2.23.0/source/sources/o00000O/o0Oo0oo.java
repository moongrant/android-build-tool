package o00000O;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final CharSequence f33969OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final IconCompat f33970OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f33971OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f33972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f33973OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f33974OooO0o0;

    @RequiresApi(28)
    public static class OooO00o {
        @DoNotInline
        public static o0Oo0oo OooO00o(Person person) {
            IconCompat iconCompatOooO0O0;
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f33975OooO00o = person.getName();
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f5299OooOO0O;
                icon.getClass();
                int iOooO0OO = IconCompat.OooO00o.OooO0OO(icon);
                if (iOooO0OO == 2) {
                    iconCompatOooO0O0 = IconCompat.OooO0O0(IconCompat.OooO00o.OooO0O0(icon), IconCompat.OooO00o.OooO00o(icon));
                } else if (iOooO0OO == 4) {
                    Uri uriOooO0Oo = IconCompat.OooO00o.OooO0Oo(icon);
                    uriOooO0Oo.getClass();
                    String string = uriOooO0Oo.toString();
                    string.getClass();
                    iconCompatOooO0O0 = new IconCompat(4);
                    iconCompatOooO0O0.f5302OooO0O0 = string;
                } else if (iOooO0OO != 6) {
                    iconCompatOooO0O0 = new IconCompat(-1);
                    iconCompatOooO0O0.f5302OooO0O0 = icon;
                } else {
                    Uri uriOooO0Oo2 = IconCompat.OooO00o.OooO0Oo(icon);
                    uriOooO0Oo2.getClass();
                    String string2 = uriOooO0Oo2.toString();
                    string2.getClass();
                    iconCompatOooO0O0 = new IconCompat(6);
                    iconCompatOooO0O0.f5302OooO0O0 = string2;
                }
            } else {
                iconCompatOooO0O0 = null;
            }
            oooO0O0.f33976OooO0O0 = iconCompatOooO0O0;
            oooO0O0.f33977OooO0OO = person.getUri();
            oooO0O0.f33978OooO0Oo = person.getKey();
            oooO0O0.f33980OooO0o0 = person.isBot();
            oooO0O0.f33979OooO0o = person.isImportant();
            return new o0Oo0oo(oooO0O0);
        }

        @DoNotInline
        public static Person OooO0O0(o0Oo0oo o0oo0oo2) {
            Person.Builder name = new Person.Builder().setName(o0oo0oo2.f33969OooO00o);
            Icon iconOooO0o = null;
            IconCompat iconCompat = o0oo0oo2.f33970OooO0O0;
            if (iconCompat != null) {
                iconCompat.getClass();
                iconOooO0o = IconCompat.OooO00o.OooO0o(iconCompat, null);
            }
            return name.setIcon(iconOooO0o).setUri(o0oo0oo2.f33971OooO0OO).setKey(o0oo0oo2.f33972OooO0Oo).setBot(o0oo0oo2.f33974OooO0o0).setImportant(o0oo0oo2.f33973OooO0o).build();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public CharSequence f33975OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public IconCompat f33976OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String f33977OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f33978OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f33979OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f33980OooO0o0;
    }

    public o0Oo0oo(OooO0O0 oooO0O0) {
        this.f33969OooO00o = oooO0O0.f33975OooO00o;
        this.f33970OooO0O0 = oooO0O0.f33976OooO0O0;
        this.f33971OooO0OO = oooO0O0.f33977OooO0OO;
        this.f33972OooO0Oo = oooO0O0.f33978OooO0Oo;
        this.f33974OooO0o0 = oooO0O0.f33980OooO0o0;
        this.f33973OooO0o = oooO0O0.f33979OooO0o;
    }
}
