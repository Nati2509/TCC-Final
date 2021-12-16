package com.example.referencial.pagesSaude

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.referencial.R


class DadosSaude : Fragment(), View.OnClickListener {

    private var mParam1: String? = null
    private var mParam2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = requireArguments().getString(ARG_PARAM1)
            mParam2 = requireArguments().getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_dados_saude, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val texto1 = getView()?.findViewById<TextView>(R.id.textView1text)
        val botao1 = getView()?.findViewById<Button>(R.id.copy_sa1)

        val texto2 = getView()?.findViewById<TextView>(R.id.textView2text)
        val botao2 = getView()?.findViewById<Button>(R.id.copy_sa2)

        val texto3 = getView()?.findViewById<TextView>(R.id.textView3text)
        val botao3 = getView()?.findViewById<Button>(R.id.copy_sa3)

        val texto4 = getView()?.findViewById<TextView>(R.id.textView4text)
        val botao4 = getView()?.findViewById<Button>(R.id.copy_sa4)

        val texto5 = getView()?.findViewById<TextView>(R.id.textView5text)
        val botao5 = getView()?.findViewById<Button>(R.id.copy_sa5)

        val texto6 = getView()?.findViewById<TextView>(R.id.textView6text)
        val botao6 = getView()?.findViewById<Button>(R.id.copy_sa6)

        val texto7 = getView()?.findViewById<TextView>(R.id.textView7text)
        val botao7 = getView()?.findViewById<Button>(R.id.copy_sa7)

        val texto8 = getView()?.findViewById<TextView>(R.id.textView8text)
        val botao8 = getView()?.findViewById<Button>(R.id.copy_sa8)

        val texto9 = getView()?.findViewById<TextView>(R.id.textView9text)
        val botao9 = getView()?.findViewById<Button>(R.id.copy_sa9)

        val texto10 = getView()?.findViewById<TextView>(R.id.textView10text)
        val botao10 = getView()?.findViewById<Button>(R.id.copy_sa10)

        val texto11 = getView()?.findViewById<TextView>(R.id.textView11text)
        val botao11 = getView()?.findViewById<Button>(R.id.copy_sa11)

        val texto12 = getView()?.findViewById<TextView>(R.id.textView12text)
        val botao12 = getView()?.findViewById<Button>(R.id.copy_sa12)


        if (botao1 != null) {
            botao1.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto1?.text.toString())


                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao2 != null) {
            botao2.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto2?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao3 != null) {
            botao3.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto3?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao4 != null) {
            botao4.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto4?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao5 != null) {
            botao5.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto5?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao6 != null) {
            botao6.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto6?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao7 != null) {
            botao7.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto7?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao8 != null) {
            botao8.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto8?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao9 != null) {
            botao9.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto9?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao10 != null) {
            botao10.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto10?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }


        if (botao11 != null) {
            botao11.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto11?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

        if (botao12 != null) {
            botao12.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto12?.text.toString())

                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

    }


    companion object {

        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"


        fun newInstance(param1: String?, param2: String?): DadosSaude {
            val fragment = DadosSaude()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onClick(v: View?) {
    }
}