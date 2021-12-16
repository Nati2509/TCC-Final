package com.example.referencial.pagesEducacao

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

class ReferencialEducacao : Fragment(), View.OnClickListener {

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

        return inflater.inflate(R.layout.fragment_referencial_educacao, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val texto1 = getView()?.findViewById<TextView>(R.id.textView1text)
        val botao1 = getView()?.findViewById<Button>(R.id.copy_edu1)

        val texto2 = getView()?.findViewById<TextView>(R.id.textView2text)
        val botao2 = getView()?.findViewById<Button>(R.id.copy_edu2)

        val texto3 = getView()?.findViewById<TextView>(R.id.textView3text)
        val botao3 = getView()?.findViewById<Button>(R.id.copy_edu3)

        val texto4 = getView()?.findViewById<TextView>(R.id.textView4text)
        val botao4 = getView()?.findViewById<Button>(R.id.copy_edu4)

        val texto5 = getView()?.findViewById<TextView>(R.id.textView5text)
        val botao5 = getView()?.findViewById<Button>(R.id.copy_edu5)



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

        // RESOLVER COMO COPIAR MAIS DE UM TEXTO EM UM SÓ !!!!
        if (botao5 != null) {
            botao5.setOnClickListener {
                val clipboardManager =
                    context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("TextView", texto5?.text.toString());
                ClipData.newPlainText("TextView", texto5?.text.toString())


                clipboardManager.setPrimaryClip(clipData)

                Toast.makeText(getActivity(), "Copiado", Toast.LENGTH_SHORT).show();
            }
        }

    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match

        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"


        fun newInstance(param1: String?, param2: String?): ReferencialEducacao {
            val fragment = ReferencialEducacao()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}