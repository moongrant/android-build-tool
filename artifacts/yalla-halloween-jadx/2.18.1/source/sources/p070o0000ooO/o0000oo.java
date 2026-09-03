package p070o0000ooO;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public CharSequence f27986OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public IconCompat f27987OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f27988OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public String f27989OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f27990OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f27991OooO0o0;

    @RequiresApi(28)
    public static class OooO00o {
        @DoNotInline
        public static o0000oo OooO00o(Person person) {
            IconCompat iconCompatOooO0O0;
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f27992OooO00o = person.getName();
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f7837OooOO0O;
                Objects.requireNonNull(icon);
                int iOooO0OO = IconCompat.OooO00o.OooO0OO(icon);
                if (iOooO0OO == 2) {
                    iconCompatOooO0O0 = IconCompat.OooO0O0(IconCompat.OooO00o.OooO0O0(icon), IconCompat.OooO00o.OooO00o(icon));
                } else if (iOooO0OO == 4) {
                    Uri uriOooO0Oo = IconCompat.OooO00o.OooO0Oo(icon);
                    Objects.requireNonNull(uriOooO0Oo);
                    String string = uriOooO0Oo.toString();
                    Objects.requireNonNull(string);
                    iconCompatOooO0O0 = new IconCompat(4);
                    iconCompatOooO0O0.f7840OooO0O0 = string;
                } else if (iOooO0OO != 6) {
                    iconCompatOooO0O0 = new IconCompat(-1);
                    iconCompatOooO0O0.f7840OooO0O0 = icon;
                } else {
                    Uri uriOooO0Oo2 = IconCompat.OooO00o.OooO0Oo(icon);
                    Objects.requireNonNull(uriOooO0Oo2);
                    String string2 = uriOooO0Oo2.toString();
                    Objects.requireNonNull(string2);
                    iconCompatOooO0O0 = new IconCompat(6);
                    iconCompatOooO0O0.f7840OooO0O0 = string2;
                }
            } else {
                iconCompatOooO0O0 = null;
            }
            oooO0O0.f27993OooO0O0 = iconCompatOooO0O0;
            oooO0O0.f27994OooO0OO = person.getUri();
            oooO0O0.f27995OooO0Oo = person.getKey();
            oooO0O0.f27997OooO0o0 = person.isBot();
            oooO0O0.f27996OooO0o = person.isImportant();
            return new o0000oo(oooO0O0);
        }

        @DoNotInline
        public static Person OooO0O0(o0000oo o0000ooVar) {
            Person.Builder name = new Person.Builder().setName(o0000ooVar.f27986OooO00o);
            IconCompat iconCompat = o0000ooVar.f27987OooO0O0;
            return name.setIcon(iconCompat != null ? iconCompat.OooO0o0() : null).setUri(o0000ooVar.f27988OooO0OO).setKey(o0000ooVar.f27989OooO0Oo).setBot(o0000ooVar.f27991OooO0o0).setImportant(o0000ooVar.f27990OooO0o).build();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public CharSequence f27992OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public IconCompat f27993OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String f27994OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f27995OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f27996OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f27997OooO0o0;
    }

    public o0000oo(OooO0O0 oooO0O0) {
        this.f27986OooO00o = oooO0O0.f27992OooO00o;
        this.f27987OooO0O0 = oooO0O0.f27993OooO0O0;
        this.f27988OooO0OO = oooO0O0.f27994OooO0OO;
        this.f27989OooO0Oo = oooO0O0.f27995OooO0Oo;
        this.f27991OooO0o0 = oooO0O0.f27997OooO0o0;
        this.f27990OooO0o = oooO0O0.f27996OooO0o;
    }
}
