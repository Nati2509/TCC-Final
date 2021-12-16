package com.example.referencial.pagesCultura

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
import com.example.referencial.pagesEconomia.CitacoesEconomia

class CitacoesCultura : Fragment(), View.OnClickListener {

    private var mParam1: String? = null
    private var mParam2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = requireArguments().getString(CitacoesEconomia.ARG_PARAM1)
            mParam2 = requireArguments().getString(CitacoesEconomia.ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_citacoes_cultura, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val texto1 = getView()?.findViewById<TextView>(R.id.textView1)
        val botao1 = getView()?.findViewById<Button>(R.id.copy_c1)

        val texto2 = getView()?.findViewById<TextView>(R.id.textView2)
        val botao2 = getView()?.findViewById<Button>(R.id.copy_c2)

        val texto3 = getView()?.findViewById<TextView>(R.id.textView3)
        val botao3 = getView()?.findViewById<Button>(R.id.copy_c3)

        val texto4 = getView()?.findViewById<TextView>(R.id.textView4)
        val botao4 = getView()?.findViewById<Button>(R.id.copy_c4)

        val texto5 = getView()?.findViewById<TextView>(R.id.textView5)
        val botao5 = getView()?.findViewById<Button>(R.id.copy_c5)

        val texto6 = getView()?.findViewById<TextView>(R.id.textView6)
        val botao6 = getView()?.findViewById<Button>(R.id.copy_c6)

        val texto7 = getView()?.findViewById<TextView>(R.id.textView7)
        val botao7 = getView()?.findViewById<Button>(R.id.copy_c7)

        val texto8 = getView()?.findViewById<TextView>(R.id.textView8)
        val botao8 = getView()?.findViewById<Button>(R.id.copy_c8)

        val texto9 = getView()?.findViewById<TextView>(R.id.textView9)
        val botao9 = getView()?.findViewById<Button>(R.id.copy_c9)

        val texto10 = getView()?.findViewById<TextView>(R.id.textView10)
        val botao10 = getView()?.findViewById<Button>(R.id.copy_c10)


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

    }

    companion object {
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        fun newInstance(param1: String?, param2: String?): CitacoesCultura {
            val fragment = CitacoesCultura()
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